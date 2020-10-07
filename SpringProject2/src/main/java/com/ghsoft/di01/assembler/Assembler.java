package com.ghsoft.di01.assembler;



import com.ghsoft.di01.spring.ChangePasswordService;
import com.ghsoft.di01.spring.MemberDAO;
import com.ghsoft.di01.spring.MemberRegisterService;

public class Assembler {

	private MemberDAO memberDAO;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;

	public Assembler() {
		memberDAO = new MemberDAO();
		regSvc = new MemberRegisterService(memberDAO);
		pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDAO);
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
