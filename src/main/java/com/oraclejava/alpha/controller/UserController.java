package com.oraclejava.alpha.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oraclejava.alpha.model.User;
import com.oraclejava.alpha.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	
	@Autowired
	private  UserService  userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public  ModelAndView  index()
	{
		//List<User>  users  = userService.selectList();
		List<User>  users  =  new ArrayList<>();
		
		ModelAndView  mav = new ModelAndView("user/userList");
		
		
		return  mav;
	}
	
	
}
