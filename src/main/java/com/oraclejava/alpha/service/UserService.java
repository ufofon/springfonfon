package com.oraclejava.alpha.service;

import com.oraclejava.alpha.model.UserAccount;

public interface UserService {
	
	UserAccount  selectUserAccountByLoginId(String loginId);

}
