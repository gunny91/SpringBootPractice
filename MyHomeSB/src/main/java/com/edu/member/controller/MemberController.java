package com.edu.member.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.member.domain.MemberDTO;
import com.edu.member.service.MemberService;

/**
 * To do @MapperScan we need to write the @MapperScan or not project can't find the mapper xml files
 * 
 * @author Geonhee Cho
 *
 */
@Controller
@RequestMapping("member/*") //common url mapping
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService memberService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String getMember() throws Exception {
		logger.info("Register...");
		return "member/register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String postMember(MemberDTO memberDTO) throws Exception{
		logger.info("member post controller");
		
		//Id is existing or not
		//if data exist, return 1 or 0
		int result = memberService.idCheck(memberDTO);
		logger.info("MemberController Return Count[" + result + "].....");
		
		try {
			if(result >= 1) { // 아이디를 이미 사용하고 있다면 
				return "/member/register";
			} else if(result == 0) {
				// 사용가능한 아이디면 회원가입을 시켜준다.
				memberService.register(memberDTO);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}

		
		return "redirect:/member/login";
	}
}
