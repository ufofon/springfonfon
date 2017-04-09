package com.oraclejava.alpha.dao;

import com.oraclejava.alpha.model.User;
import com.oraclejava.alpha.model.UserAccount;
import com.oraclejava.alpha.model.search.PageResult;
import com.oraclejava.alpha.model.search.UserSearch;

public interface UserDao {

	Long  insertUser(User user);
	void updateUser(User user);
	void deleteUser(Long  id);
	
	User  selectUser(Long id);
	
	//TODO  select  page  users
	PageResult<User>  selectUsers(UserSearch userSearch);
	
	UserAccount  selectUserAccountByLoginId(String loginId);
	
	
}
