package com.ghsoft.di01.spring;

import java.util.Collection;

public class MemberListPrinter {

	
	private MemberDAO memberDAO;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDAO member, MemberPrinter print) {
		memberDAO =member;
		 printer =print;
	}
	
	public void printAll() {
		Collection<Member> members = memberDAO.selectAll();
		
		for(Member m : members) {
			printer.print(m);
		}	
	}
}
