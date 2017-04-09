package com.oraclejava.alpha.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

	@RequestMapping("/")
	public String index() {
		System.out.println("수선화~~~");
		System.out.println("call  index page");
		return "index";
	}

	@RequestMapping("/login")
	public String loginForm() {

		System.out.println("call  login  form");
		System.out.println("백합~~~");

		return "login";
	}

	@RequestMapping("/doLogin")
	public String login(@RequestParam("loginId") String  loginId,
			        @RequestParam("password") String password) {
	
		//	String loginId = request.getParameter("loginId");
	    //	String password = request.getParameter("password");

		System.out.println("loginId : " + loginId);
		System.out.println("password : " + password);

		if ("ojuser".equals(loginId) && "1234".equals(password)) {
			// 성공 메인 페이지 이동
			return "redirect:/";
		} else {
			// 실패 로그인 페이지 다시 간다
			return "redirect:/login?err=1";
		}

	}
	
	
	
	
	
	
	
	
	

}
