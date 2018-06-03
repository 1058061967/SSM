package com.ssm.service;

import java.util.List;

import com.ssm.model.User;

public interface UserService {

	List<User> searchAllUser();
	User searchUserById(Integer id);
	

}
