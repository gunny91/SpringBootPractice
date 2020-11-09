package com.edu.member.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.edu.member.controller.MemberController;
import com.edu.member.domain.MemberDTO;
import com.edu.member.mapper.MemberMapper;

@Repository("com.edu.member.service.MemberService")
public class MemberService {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	@Resource(name ="com.edu.member.mapper.MemberMapper")
	MemberMapper memberMapper;
	
	
	public int idCheck(MemberDTO memberDTO) throws Exception {
		logger.info("member service idCheck()");
		
		int result = memberMapper.idCheck(memberDTO);
		return result;
	}
	
	public void register(MemberDTO memberDTO) throws Exception{
		logger.info("MemberService register()...");	
		memberMapper.register(memberDTO);
	}
	
	

}
