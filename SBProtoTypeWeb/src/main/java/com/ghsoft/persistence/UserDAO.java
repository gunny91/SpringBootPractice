package com.ghsoft.persistence;

import com.ghsoft.domain.LoginDTO;
import com.ghsoft.domain.UserDTO;


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
