package com.ghsoft.java01.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ghsoft.java01.config.ConfigPart1;
import com.ghsoft.java01.config.ConfigPart2;
import com.ghsoft.java01.spring.MemberInfoPrinter;
import com.ghsoft.java01.spring.MemberRegisterService;
import com.ghsoft.java01.spring.RegisterRequest;

public class MainTowConfs2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigPart1.class,ConfigPart2.class);
		
		MemberRegisterService regSvc = context.getBean("memberRegSvc",MemberRegisterService.class);
		MemberInfoPrinter info = context.getBean("infoPrinter",MemberInfoPrinter.class);
		
		RegisterRequest regReq = new RegisterRequest();
		
		regReq.setEmail("gunny@iastate.edu");
		regReq.setName("Gunny");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		
		info.printMemberInfo("gunny@iastate.edu");

	}

}
