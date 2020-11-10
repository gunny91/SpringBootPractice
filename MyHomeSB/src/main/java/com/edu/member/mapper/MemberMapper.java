package com.edu.member.mapper;

import org.springframework.stereotype.Repository;

import com.edu.member.domain.MemberDTO;

@Repository("com.edu.member.mapper.MemberMapper")
public interface MemberMapper {

	
	/**
	 * ID check that already exist or not
	 * @param memberDTO
	 * @return result 
	 */
	public int idCheck(MemberDTO memberDTO) throws Exception;
	
	/**
	 * Member registration
	 * 
	 */
	public void register(MemberDTO memberDTO) throws Exception;

	/**
	 * Login method to check ID and Password from DB and GUI form 
	 * @param memberDTO
	 * @return 
	 */
	public MemberDTO login(MemberDTO memberDTO) throws Exception;

	public void memberUpdate(MemberDTO memberDTO) throws Exception;
	
	public void memberDelete(MemberDTO memberDTO) throws Exception;
}
