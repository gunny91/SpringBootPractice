package com.ghsoft.java01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ghsoft.java01.spring.MemberDAO;
import com.ghsoft.java01.spring.MemberRegisterService;


@Configuration
@Import(ConfigPartSub.class)
//@Import(ConfigPart1.class, configPart2.class)
public class ConfigPartMain {

	@Bean
	public MemberDAO memberDAO() {return new MemberDAO();}

	@Bean
	public MemberRegisterService memberRegSvc() {return new MemberRegisterService(memberDAO());}
	
	
	
	
}
