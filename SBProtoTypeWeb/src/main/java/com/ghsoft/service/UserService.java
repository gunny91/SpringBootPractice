package com.ghsoft.service;

import com.ghsoft.domain.UserDTO;

public interface  UserService {

	
	public void register(UserDTO userDTO) throws Exception;
	
	public UserDTO login(UserDTO userDTO) throws Exception;

	
}
