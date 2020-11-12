package com.ghsoft.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ghsoft.controller.UserController;
import com.ghsoft.domain.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final String namespace="com.ghsoft.mapper.usermapper";
	private final SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Inject
	public UserDAOImpl(SqlSession sqlSession) {this.sqlSession =sqlSession;}
	
	@Override
	public void insertUser(UserDTO userDTO) throws Exception {
		sqlSession.insert(namespace+".insertUser",userDTO);
	}

	@Override
	public UserDTO login(UserDTO userDTO) throws Exception {
		
			logger.info("MemberService  login()...");	
			
			return  sqlSession.selectOne(namespace+".login",userDTO );
		}

	



}
