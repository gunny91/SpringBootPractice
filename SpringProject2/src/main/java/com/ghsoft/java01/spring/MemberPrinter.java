package com.ghsoft.java01.spring;

public class MemberPrinter {

	
	
	public void print(Member member) {
		System.out.printf("Member Info : ID =%d, Enail = %s, Name =%s, Reg Date=%tF \n", member.getId(), member.getEmail(), member.getName(), member.getRegisterDateTime());
		
	}
	
}
