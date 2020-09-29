package com.edu.exam.service;

import java.util.List;

import com.edu.exam.dto.MemberDTO;

public interface MemberService {

	
	public List<MemberDTO> selectMember() throws Exception;
	
}
