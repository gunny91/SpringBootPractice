package com.ghsoft.java01.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ghsoft.java01.spring.MemberDAO;
import com.ghsoft.java01.spring.MemberInfoPrinter;
import com.ghsoft.java01.spring.MemberPrinter;

@Configuration
public class ConfigPart2 {

	@Autowired
	private MemberDAO memberDAO;
	//private ConfigPart1 configPart1;
	
	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter info = new MemberInfoPrinter();
		//info.setMemberDAO(configPart1.memberDAO());
		info.setMemberDAO(memberDAO);
		info.setPrinter(printer());
		
		return info;
	}
	
}
