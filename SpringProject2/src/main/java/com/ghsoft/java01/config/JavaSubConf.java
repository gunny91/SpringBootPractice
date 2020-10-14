package com.ghsoft.java01.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ghsoft.java01.spring.MemberDAO;
import com.ghsoft.java01.spring.MemberPrinter;
import com.ghsoft.java01.spring.MemberRegisterService;

@Configuration
public class JavaSubConf {

	@Autowired
	private MemberDAO memberDAO;
	
	@Bean 
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		
		return new MemberRegisterService(memberDAO);
	}
	
}
