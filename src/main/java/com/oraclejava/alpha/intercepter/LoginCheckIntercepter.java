package com.oraclejava.alpha.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckIntercepter  extends  HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession  session  = request.getSession();
		
		String  loginId = (String) session.getAttribute("loginId");
		
		if (loginId == null) {
          throw  new  HTTPException(403);			
		}
		//true : intercepter  를 통과해서  Controller  까지 진행
		//false : 작업 중단, 메시지 없음
		return true;
	}
	
}
