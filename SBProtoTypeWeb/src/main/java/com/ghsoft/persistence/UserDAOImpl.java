package com.ghsoft.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ghsoft.domain.LoginDTO;
import com.ghsoft.domain.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final String namespace="com.ghsoft.mapper.usermapper";
	private final SqlSession sqlSession;
	
	@Inject
	public UserDAOImpl(SqlSession sqlSession) {this.sqlSession =sqlSession;}
	
	@Override
	public void insertUser(UserDTO userDTO) throws Exception {
		sqlSession.insert(namespace+".insertUser",userDTO);
	}

	@Override
	public UserDTO login(LoginDTO loginDTO) throws Exception {
		
		return sqlSession.selectOne(namespace +".login",loginDTO);
	}

}
