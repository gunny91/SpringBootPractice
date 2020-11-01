package com.ghsoft.user.service;

import com.ghsoft.user.dto.LoginDTO;
import com.ghsoft.user.dto.UserDTO;

public interface  UserService {

	
	public void register(UserDTO userDTO) throws Exception;
	
	public UserDTO login(LoginDTO loginDTO) throws Exception;
}
