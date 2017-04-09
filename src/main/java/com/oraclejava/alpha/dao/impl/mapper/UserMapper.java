package com.oraclejava.alpha.dao.impl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.oraclejava.alpha.model.User;
import com.oraclejava.alpha.model.UserAccount;
import com.oraclejava.alpha.model.search.UserSearch;

@Mapper
public interface UserMapper {
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(Long  id);
	
	User  selectUser(Long  id);
	
	/*List<User>  selectUsers(@Param("name") String name,
			                @Param("status") String status);
			                
			                * map  기법
			                */
	
	
	List<User>  selectUsers(UserSearch userSearch);

	
	int  selectUsersCount(UserSearch  userSearch);
	
	void  insertUserAccount(UserAccount  userAccount);
	void  updateUserAccount(UserAccount  userAccount);
	void  deleteUserAccount(Long  userId);

	
	
	void  selectUserAccount(Long  userId);
	UserAccount  selectUserAccountByLoginId(String  loginId);
	
	
	
	
}






