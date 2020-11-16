package com.ghsoft.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ghsoft.controller.UserController;
import com.ghsoft.domain.UserDTO;
import com.ghsoft.mapper.UserMapper;

@Repository
public class UserService {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource//(name = "com.ghsoft.mapper.UserMapper")
	UserMapper userMapper;

	public int idCheck(UserDTO userDTO) throws Exception {
		logger.info("member service idCheck()");

		int result = userMapper.idCheck(userDTO);
		return result;
	}

	public void register(UserDTO userDTO) throws Exception {
		logger.info("MemberService register()...");
		userMapper.register(userDTO);
	}

//	public UserDTO login(UserDTO userDTO) throws Exception {
//		logger.info("User Service  login()...");
//		logger.info("User "+ userDTO);
//		return userMapper.login(userDTO);
//	}
	
	public UserDTO signin(UserDTO userDTO) throws Exception {
		logger.info("User Service  login()...");
		logger.info("User "+ userDTO);
		return userMapper.singin(userDTO);
	}
//
//	public void memberUpdate(UserDTO userDTO) throws Exception {
//		logger.info("MemberService  memberUpdate...");
//		userMapper.memberUpdate(userDTO);
//	}
//
//	public void memberDelete(UserDTO userDTO) throws Exception {
//		logger.info("MemberService memberDelete...");
//		userMapper.memberDelete(userDTO);
//	}

}
