package com.edu.member.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.member.domain.MemberDTO;
import com.edu.member.service.MemberService;

/**
 * To do @MapperScan we need to write the @MapperScan or not project can't find
 * the mapper xml files
 * 
 * @author Geonhee Cho
 *
 */
@Controller
@RequestMapping("member/*") // common url mapping
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	// 컨트롤러 => 서비스 => Mapper
	@Inject
	MemberService memberService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getMember() throws Exception {
		logger.info("Register...");
		return "member/register";
	}

//	/회원가입 POST : 회원가입에 필요한 자료를 가지고 회원가입 요청이 들어오면
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postMember(MemberDTO memberDTO) throws Exception {
		logger.info("MemberController postRegister().....");

		// 회원아이디가 존재하는지 검사한다.
		// 데이터가 존재하면 1, 아니면 0을 돌려 받는다.
		int result = memberService.idCheck(memberDTO);
		logger.info("MemberController Return Count[" + result + "].....");

		try {
			if (result >= 1) { // 아이디를 이미 사용하고 있다면
				return "/member/register";
			} else if (result == 0) {
				// 사용가능한 아이디면 회원가입을 시켜준다.
				memberService.register(memberDTO);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}

		return "redirect:/member/login";
	}

	@ResponseBody
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public int idCheck(MemberDTO memberDTO) throws Exception {

		logger.info("MemberCOntroller" + memberDTO);

		int result = memberService.idCheck(memberDTO);
		logger.info("MemberController Return Value " + result);
		return result;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() throws Exception {

		logger.info("Login page");
		return "/member/login";
	}

	/**
	 * Login Post method
	 * 
	 * @return jsp link
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(MemberDTO memberDTO, HttpServletRequest req, RedirectAttributes rttr) throws Exception {

		logger.info("MemberController login POST.....");

		HttpSession session = req.getSession();
		//// logger.info("MemberController login POST session : " + session);

		// 넘겨받은 회원정보를 가지고 서비스에게 의뢰를 한다.
		MemberDTO login = memberService.login(memberDTO);
		logger.info("MemberController Return Value : " + login);

		//////////////////////////////////////////////////////////
		// When there is no member info
		if (login == null) {
			session.setAttribute("member", null);

			// rttr.addAttribute() this will variable name or value will exposure at the
			// https address
			// rttr.addAttribute("msg",false);

			// Use RedirectAttributes to make them hide
			rttr.addFlashAttribute("msg", false);

		} else {
			// when member is exist
			session.setAttribute("member", login);
		}

		return "redirect:/member/login";
	}

	/**
	 * Log out
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {

		logger.info("member controller logout()");

		// delete the session and return to the login page
		session.invalidate();

		return "redirect:/member/login";
	}

	/**
	 * 
	 */
	@RequestMapping(value = "/memberUpdate", method = RequestMethod.GET)
	public String memberUpdate() {
		logger.info("MemberController member Update()");

		return "/member/memberUpdate";
	}

	@RequestMapping(value = "/memberUpdate", method = RequestMethod.POST)
	public String memberPostUpdate(MemberDTO memberDTO, HttpSession session) throws Exception {
		logger.info("member post update");

		memberService.memberUpdate(memberDTO);

		// when member revise the info, then login again
		session.invalidate();

		return "redirect:/member/login";
	}

	@RequestMapping(value = "/memberDelete", method = RequestMethod.GET)
	public String memberDelete(MemberDTO memberDTO, HttpSession session) throws Exception {

		logger.info("member get delete");
		return "/member/memberDelete";
	}

	/**
	 * 
	 * @param memberDTO
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/memberDelete", method = RequestMethod.POST)
	public String memberPostDelete(MemberDTO memberDTO, HttpSession session, RedirectAttributes rttr) throws Exception {
		logger.info("member post delete");

		// bring the Session member info and store it at member instance variable
		MemberDTO member = (MemberDTO) session.getAttribute("member");

		// session pw from db
		String sessionPasswd = member.getUserpw();

		// compare with the pw from memberDTO and db pw
		if (memberDTO.getUserpw().equals(sessionPasswd)) {
			// work for member delete to service
			memberService.memberDelete(memberDTO);
			session.invalidate();
		} else {
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/meberDelete";
		}

		return "redirect:/member/login";
	}

	/**
	 * Sign up id check
	 * 
	 * @return member.registerAjaxl link
	 * @throws Exception
	 */
	@RequestMapping(value = "/registerAjax", method = RequestMethod.GET)
	public String getRegisterAjax() throws Exception {

		logger.info("MemberController get RegisterAjax get");
		return "/member/registerAjax";
	}

	
	/**
	 * Sign up id check Post
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/registerAjax", method = RequestMethod.POST)
	public String postRegisterAjax(MemberDTO memberDTO) throws Exception {

		logger.info("MemberController get RegisterAjax Post");
		
		//ID check if id exist, return 1 otherwise return 0
		int result = memberService.idCheck(memberDTO);
		
		try {
			if(result ==1) {return "/member/registerAjax";}
			else if(result==0){ memberService.register(memberDTO);}
		}catch(Exception e){
			e.printStackTrace();
			//throw new RunTimeException();
		}
		return "/member/registerAjax";
	}

}
