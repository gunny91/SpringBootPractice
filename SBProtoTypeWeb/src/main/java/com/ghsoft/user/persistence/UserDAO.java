package com.ghsoft.user.persistence;

import org.springframework.stereotype.Repository;

import com.ghsoft.user.dto.LoginDTO;
import com.ghsoft.user.dto.UserDTO;


public interface UserDAO {
	
	/**
	 * User register
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(UserDTO user) throws Exception;
	
	 /**
	  * User Login 
	  * @param loginDTO
	  * @return
	  * @throws Exception
	  */
    public UserDTO login(LoginDTO loginDTO) throws Exception;
}
