package com.ghsoft.service;

import com.ghsoft.domain.LoginDTO;
import com.ghsoft.domain.UserDTO;

public interface  UserService {

	
	public void register(UserDTO userDTO) throws Exception;
	
	public UserDTO login(LoginDTO loginDTO) throws Exception;
}