package com.ssm.service;

import java.util.List;

import com.ssm.model.User;

public interface UserService {

	public	List<User> searchAllUser();
	public	User searchUserById(Integer id);
	public void createUser(User user);
	
	
	

}
