package com.ghsoft.user.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ghsoft.user.dto.LoginDTO;
import com.ghsoft.user.dto.UserDTO;
import com.ghsoft.user.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserDAO userDAO;
	
	@Inject
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public void register(UserDTO userDTO) throws Exception {
		userDAO.insertUser(userDTO);
		
	}

	@Override
	public UserDTO login(LoginDTO loginDTO) throws Exception {
		
		return userDAO.login(loginDTO);
	}
	
}
