package com.ghsoft.di02.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	//private MemberDao memberDao = new memberDao();
	private MemberDAO memberDAO;
	
	// @Autowired : 자동 주입 기능
	// 자동 주입 기능을 사용하면 설정파일에 <constructor-arg>를 사용하지 않아도 된다.
	@Autowired(required=false)
	public MemberRegisterService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public MemberRegisterService() {}
	
	public void regist(RegisterRequest req) {
		//이메일로 회원 데이터(Member)를 조회한다.
		Member member = memberDAO.selectByEmail(req.getEmail());
		if(member != null) {
			//같은 이메일을 가진 회원이 이미 존재한다면 익셉션을 발생시킨다.
			throw new AlreadyExistingMemberException("중복된 이메일 : " + req.getEmail());
		}
		//같은 이메일을 가진 회원이 존재하지 않으면 자료를 등록한다.
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDAO.insert(newMember);
	}
}
