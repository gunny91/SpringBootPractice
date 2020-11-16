package com.ghsoft.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ghsoft.domain.UserDTO;

@Mapper
public interface UserMapper {
	
	/**
	 * User register
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(UserDTO user) throws Exception;

	public UserDTO login(UserDTO userDTO) throws Exception; 

	/**
	 * ID check that already exist or not
	 * @param UserDTO
	 * @return result 
	 */
	public int idCheck(UserDTO memberDTO) throws Exception;
	
	/**
//	 * Member registration
//	 * 
//	 */
	public void register(UserDTO memberDTO) throws Exception;
	
	public UserDTO singin(UserDTO userDTO) throws Exception;
//
//	public void memberUpdate(UserDTO memberDTO) throws Exception;
//	
//	public void memberDelete(UserDTO memberDTO) throws Exception;
	
	
}
