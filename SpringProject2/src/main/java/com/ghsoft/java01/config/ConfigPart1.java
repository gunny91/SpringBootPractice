package com.ghsoft.java01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ghsoft.java01.spring.MemberRegisterService;
import com.ghsoft.java01.spring.MemberDAO;

@Configuration
public class ConfigPart1 {

	@Bean
	public MemberDAO memberDAO() {
		return new MemberDAO();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDAO());
	}
	
}
