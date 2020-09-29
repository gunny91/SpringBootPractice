package com.edu.exam.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.exam.dto.MemberDTO;

/**
 * This is class for implementation of Member DAO's interface!
 * @author Gunny
 *
 */
@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "com.edu.mapper.memberMapper";
	
	@Override
	public List<MemberDTO> selectMember() throws Exception {
		
		
		return sqlSession.selectList(Namespace+".selectMember");
	}

}
