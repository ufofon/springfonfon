package com.oraclejava.alpha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.alpha.dao.UserDao;
import com.oraclejava.alpha.model.UserAccount;
import com.oraclejava.alpha.service.UserService;

@Service
public class UserServiceImpl  implements  UserService {

	@Autowired
	private  UserDao  userDao;
	
	
	@Override
	public UserAccount selectUserAccountByLoginId(String loginId) {

		
		
		return userDao.selectUserAccountByLoginId(loginId);
	}

}
