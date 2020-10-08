package com.ghsoft.di01.assembler;



import com.ghsoft.di01.spring.ChangePasswordService;
import com.ghsoft.di01.spring.MemberDAO;
import com.ghsoft.di01.spring.MemberRegisterService;

public class Assembler {
	private	MemberDAO	memberDAO;
	private	MemberRegisterService	regSvc;
	private	ChangePasswordService	pwdSvc;
	
	//생성자를 통해서 DI관계를 만들어준다.
	//의존 객체를 변경하려면 조립기의 코드만 수정하면 된다.
	public Assembler() {
		memberDAO	= new MemberDAO();//<==의존 객체를 변경하려면 조립기의 코드만 수정하면 된다.
		regSvc		= new MemberRegisterService(memberDAO);
		pwdSvc		= new ChangePasswordService(memberDAO);
	}

	public MemberDAO getMemberDao() {
		return memberDAO;
	}

	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}

	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
	
}