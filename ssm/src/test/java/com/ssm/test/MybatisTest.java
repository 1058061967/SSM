package com.ssm.test;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class MybatisTest {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserMapper userMapper;

//	@Test
	public void testAdd() {
		User user = new User();
		user.setName("haha");
		userMapper.createUser(user);
	}

//	@Test
	public void testList() {
		
		List<User> users = userMapper.selectAllUser();
		for(User user:users){
			System.out.println(user.getName());
		}
	}
	@Test
	public void testInsert(){
		
		User user = new User();
		user.setName("11");
		userService.createUser(user);
		
	}
	

}
