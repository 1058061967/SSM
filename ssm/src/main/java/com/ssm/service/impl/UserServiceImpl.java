package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;

@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> searchAllUser() {
		return userMapper.selectAllUser();
	}

	@Override
	public User searchUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	@Transactional
	@Override
	public void createUser(User user) {
		userMapper.insertUser(user);
	}
	

}
