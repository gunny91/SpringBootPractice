package com.ghsoft.di02.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ghsoft.di02.spring.MemberInfoPrinter;
import com.ghsoft.di02.spring.MemberRegisterService;
import com.ghsoft.di02.spring.RegisterRequest;

public class Main4 {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:di2/appCtx4.xml");

		MemberRegisterService regSvc = 	ctx.getBean("memberRegSvc",MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		
		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("gunny@gmail.com");
		regReq.setName("Geonhee");
		regReq.setPassword("12345");
		regReq.setConfirmPassword("12345");
		regSvc.regist(regReq);
		infoPrinter.printMemberInfo("gunny@gmail.com");
		
		
	}

}
