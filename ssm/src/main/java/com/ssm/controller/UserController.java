package com.ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.model.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/Login")
	public ModelAndView login(
//			@RequestParam(value="name",required=false) String name,
//			@RequestParam("password") String password
			){
		ModelAndView mv = new ModelAndView("menu");
		User user = userService.searchUserById(1);
		mv.addObject("name",user.getName());
		return mv;
	}

}
