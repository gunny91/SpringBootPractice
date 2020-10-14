package com.ghsoft.java01.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.ghsoft.java01.spring.MemberDAO;
import com.ghsoft.java01.spring.MemberPrinter;
import com.ghsoft.java01.spring.MemberRegisterService;

@Configuration
@ImportResource("classpath:sub_conf.xml")
public class JavaMainConf {

	@Autowired
	private MemberDAO memberDAO;
	
	@Bean
	public MemberPrinter memberPrinter() {
		
		return new MemberPrinter();
	}
	
	@Bean
	public MemberRegisterService memberRgSvc() {
		return new MemberRegisterService(memberDAO);
	}
}
