package com.oraclejava.alpha.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oraclejava.alpha.model.UserAccount;
import com.oraclejava.alpha.service.UserService;

@Controller
public class RootController {
	
		
	@Autowired
	private  UserService  userService;
	

	@RequestMapping("/")
	public String index(Model model) {
		
		System.out.println("call  index page");

		return "index";
	}
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginForm() {

		System.out.println("call  22  login  form");
		System.out.println("백합  333~~~");
		return "login";
	}	
	
	
	
/*
	@RequestMapping("/login")
	public String loginForm() {

		System.out.println("call  login  form");
		System.out.println("백합~~~");

		return "login";
	}

	@RequestMapping("/doLogin")
	public String login(@RequestParam("loginId") String  loginId,
			        @RequestParam("password") String password,
			        HttpSession session      
			) {
	
		//	String loginId = request.getParameter("loginId");
	    //	String password = request.getParameter("password");

		System.out.println("loginId : " + loginId);
		System.out.println("password : " + password);

	UserAccount  userAccount 
	= userService.selectUserAccountByLoginId(loginId);
		
		
		
		if (userAccount != null &&				
			userAccount.getPassword().equals(password)) {
			session.setAttribute("loginId", userAccount.getLoginId());
			session.setAttribute("userId", userAccount.getUserId());
			
			
			
			System.out.println("로그인 성공 !!!");
			
			// 성공 메인 페이지 이동
			return "redirect:/";
		} else {
		System.out.println("로그인 실패@@@");
			// 실패 로그인 페이지 다시 간다
			return "redirect:/login?err=1";
		}

	}
	@RequestMapping("logout")
	public  String  logout(HttpSession  session)
	{
		session.invalidate();
		
		return  "redirect:/";
	}
*/
}
