package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class MybatisTest {

	@Autowired
	private UserMapper userMapper;

//	@Test
	public void testAdd() {
		User user = new User();
		user.setName("haha");
		userMapper.createUser(user);
	}

	@Test
	public void testList() {
		
		List<User> users = userMapper.selectAllUser();
		for(User user:users){
			System.out.println(user.getName());
		}
	}

}
