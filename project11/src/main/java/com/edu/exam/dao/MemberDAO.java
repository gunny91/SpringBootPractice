package com.edu.exam.dao;

import java.util.List;

import com.edu.exam.dto.MemberDTO;

public interface MemberDAO {
	
	
	public List<MemberDTO> selectMember() throws Exception;
	
}
