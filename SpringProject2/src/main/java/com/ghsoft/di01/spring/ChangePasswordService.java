package com.ghsoft.di01.spring;

public class ChangePasswordService {

	private MemberDAO memberDAO;
	
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDAO = memberDao;
	}
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		//비밀번호 변경 요청이 들어오면, 먼저 email에 해당하는 회원이 있는가 검사한다.
		Member member = memberDAO.selectByEmail(email);
		
		//이메일에 해당하는 회원이 존재하지 않으면, 익셉션 처리를 한다.
		if(member == null) 
			throw new MemberNotFoundException();
		
		//이메일에 해당하는 회원이 존재하면, 비밀번호를 변경한다.
		//member.changePassword(oldPwd, newPwd);에서 익셉션이 발생하지 않았다면,
		//한명의 회원(member객체)의 password값이 변경되었다는 의미이다.
		member.changePassword(oldPwd, newPwd);
		
		//바뀐 회원의 정보(비밀번호)를 업데이트한다.
		memberDAO.update(member);
	}
}











