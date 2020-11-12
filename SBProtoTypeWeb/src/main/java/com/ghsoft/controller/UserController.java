package com.ghsoft.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ghsoft.domain.UserDTO;
import com.ghsoft.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);


	
	@Inject
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public String homeTemp(Model model) {
		model.addAttribute("homepage", "This is Home page");
		return "/temp/home";
	}

	@RequestMapping(value = "/user/signIn", method = RequestMethod.GET)
	public String userSignUp(Model model) {

		return "/user/signIn";
	}

	@RequestMapping(value = "/user/signUp", method = RequestMethod.GET)
	public String userSignInGet() throws Exception {
		return "/user/signUp";
	}

	@RequestMapping(value = "/user/signIn", method = RequestMethod.POST)
	public String userSignIn(Model model, UserDTO userDTO) throws Exception {

		userService.register(userDTO);
		return "redirect:/user/signIn";
	}

	@RequestMapping("/user/userInsert")
	public String userInsert(Model model) {
		return "/user/signIn";
	}

//	@RequestMapping(value="/logedIn", method = RequestMethod.GET)
//	public String userLogedIn() {
//		return "/user/logedIn";
//	}

//	@RequestMapping(value="/user/logedIn", method = RequestMethod.POST)
//	public String doLogin(LoginDTO loginDTO, Model model) throws Exception{
//		UserDTO userDTO = userService.login(loginDTO);
//		
//		if(userDTO ==null || userDTO.getUserPw()!=loginDTO.getUserPw()) {}
//		
//		model.addAttribute("userId", userDTO);
//		return "/user/logedIn";
//		
//	}
//	
	@RequestMapping(value = "/user/logIn", method = RequestMethod.GET)
	public String getLogin() throws Exception {

		logger.info("Login page");
		return "/user/signIn";
	}

	/**
	 * Login Post method
	 * 
	 * @return jsp link
	 * @throws Exception
	 */
	@RequestMapping(value = "/user/logIn", method = RequestMethod.POST)
	public String postLogin(UserDTO userDTO, HttpServletRequest req, RedirectAttributes rttr) throws Exception {

		logger.info("MemberController login POST.....");

		HttpSession session = req.getSession();
		//// logger.info("MemberController login POST session : " + session);

		// 넘겨받은 회원정보를 가지고 서비스에게 의뢰를 한다.
		UserDTO login = userService.login(userDTO);
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

		return "redirect:/user/signIn";
	}

	/**
	 * Log out
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {

		logger.info("User controller logout()");

		// delete the session and return to the login page
		session.invalidate();

		return "redirect:/user/signIn";
	}

	
	
	
}
