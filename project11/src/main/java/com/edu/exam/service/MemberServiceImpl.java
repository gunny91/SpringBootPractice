package com.edu.exam.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.edu.exam.dao.MemberDAO;
import com.edu.exam.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberDTO> selectMember() throws Exception {
		return dao.selectMember();
	}

}
