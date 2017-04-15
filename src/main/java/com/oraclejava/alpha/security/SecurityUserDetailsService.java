package com.oraclejava.alpha.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.oraclejava.alpha.dao.UserDao;
import com.oraclejava.alpha.model.UserAccount;

public class SecurityUserDetailsService implements  UserDetailsService  {

	@Autowired
	private  UserDao  userDao;
	
	
	@Override
	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {

	  UserAccount  userAccount =userDao.selectUserAccountByLoginId(loginId);
		
	  if (userAccount  ==  null) {
		  throw  new UsernameNotFoundException("해당 아이디 사용자가 없습니다.");
		
     	}
	  
	   LoginUser  loginUser  = new LoginUser(userAccount.getLoginId(),userAccount.getPassword());
	  
		return loginUser;
	}

}
