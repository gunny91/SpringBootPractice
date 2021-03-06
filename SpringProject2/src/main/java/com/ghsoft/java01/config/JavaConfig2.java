package com.ghsoft.java01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ghsoft.java01.spring.MemberDAO;
import com.ghsoft.java01.spring.MemberInfoPrinter;
import com.ghsoft.java01.spring.MemberPrinter;
import com.ghsoft.java01.spring.MemberRegisterService;

@Configuration 
public class JavaConfig2 {

	@Bean
	public MemberDAO memberDAO() {
		
		return new MemberDAO();
	}
	// Same as <beab id="memberDAO" class="spring.MemberDAO"/>
	
	@Bean
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDAO());
	}
	
	@Bean
	public MemberPrinter printer() {
		
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter info = new MemberInfoPrinter();
//		info.setMemberDAO(memberDAO());
//		info.setPrinter(printer());
		return info;
	}
	
	
	
	
}
