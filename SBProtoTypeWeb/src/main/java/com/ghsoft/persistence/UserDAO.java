package com.ghsoft.persistence;

import com.ghsoft.domain.UserDTO;


public interface UserDAO {
	
	/**
	 * User register
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(UserDTO user) throws Exception;
	

	public UserDTO login(UserDTO userDTO) throws Exception; 

}
