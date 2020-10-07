package com.ghsoft.di01.spring;

import java.util.Date;

public class MemberRegisterService {
	private MemberDAO memberDAO;

	public MemberRegisterService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public Long regist(RegisterRequest req) {
		Member member = memberDAO.selectByEmail(email);
		if (member != null) {
			throw new AlreadyExistingMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(), req.getRegisterDateTime());
		memberDAO.insert(newMember);
		return newMember.getId();
	}
}
