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
}
