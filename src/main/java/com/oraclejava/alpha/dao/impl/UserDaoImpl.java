package com.oraclejava.alpha.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oraclejava.alpha.dao.UserDao;
import com.oraclejava.alpha.dao.impl.mapper.UserMapper;
import com.oraclejava.alpha.model.User;
import com.oraclejava.alpha.model.UserAccount;
import com.oraclejava.alpha.model.search.PageResult;
import com.oraclejava.alpha.model.search.UserSearch;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;

	@Transactional()
	@Override
	public Long insertUser(User user) {
		userMapper.insertUser(user);

		UserAccount userAccount = user.getUserAccount();
		userAccount.setUserId(user.getId());
		userMapper.insertUserAccount(userAccount);

		return user.getId();
	}

	@Transactional
	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);

		UserAccount userAccount = user.getUserAccount();
		if (userAccount != null) {
			userMapper.updateUserAccount(userAccount);
		}
	}

	@Transactional
	@Override
	public void deleteUser(Long id) {
		userMapper.deleteUserAccount(id);
	}

	@Transactional
	@Override
	public User selectUser(Long id) {
		return userMapper.selectUser(id);
	}

	@Transactional
	@Override
	public UserAccount selectUserAccountByLoginId(String loginId) {
		return userMapper.selectUserAccountByLoginId(loginId);
	}

	@Override
	public PageResult<User> selectUsers(UserSearch userSearch) {

		int totalCount = userMapper.selectUsersCount(userSearch);

		if (totalCount == 0) {
			return new PageResult<User>(userSearch);
		}
		List<User> users = userMapper.selectUsers(userSearch);

		return new PageResult<User>(userSearch, users, totalCount);
	}

}
