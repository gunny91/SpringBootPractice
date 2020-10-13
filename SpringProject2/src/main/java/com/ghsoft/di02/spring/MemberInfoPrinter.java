package com.ghsoft.di02.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {

	@Autowired(required=false)
	private MemberDAO memberDAO;
	private MemberPrinter printer;

	//회원정보를 출력하는 메서드 : 설정 메서드 방식을 사용하자.
	
		
		public void setMemberDAO(MemberDAO memberDAO) {
			this.memberDAO = memberDAO;
		}
		@Autowired
		//@Qualifier("sysout")
		public void setPrinter(MemberPrinter printer) {
			this.printer = printer;
		}
		
		//지정한 회원의 정보를 출력하는 메서드
		//회원들을 구분할 수있는 것은 이메일의 값이다.
		public void printMemberInfo(String email) {
			Member member = memberDAO.selectByEmail(email);
			if(member == null) {
				System.out.println("해당하는 데이터가 없습니다.");
				return;
			}
			printer.print(member);
			System.out.println("회원정보를 출력하였습니다.");
		}
		
	}
