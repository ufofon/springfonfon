package com.oraclejava.alpha.dao.impl.mapper;



import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.oraclejava.alpha.AbstractTestConfig;
import com.oraclejava.alpha.model.User;
import com.oraclejava.alpha.model.search.UserSearch;

public class UserMapperTest2   extends  AbstractTestConfig{

	@Autowired
	private  UserMapper  userMapper;
	
	@Test
	@DatabaseSetup("/dao/impl/mapper/UserMapperTest.xml")
	public  void selectList()
	{
		UserSearch userSearch  = new UserSearch();
		userSearch.setStatus("ACTIVE");
		
		List<User>  users = userMapper.selectUsers(userSearch);
		
		assertEquals(2,users.size());
	}
	
	@Test
	@DatabaseSetup("/dao/impl/mapper/UserMapperTest.xml")
	public  void selectUsersCount()
	{
		UserSearch userSearch  = new UserSearch();
		userSearch.setStatus("ACTIVE");
		
		assertEquals(2,userMapper.selectUsersCount(userSearch));
	}


	@Test
	@DatabaseSetup("/dao/impl/mapper/UserMapperTest.xml")
	public  void selectUser()
	{
	  Long  id = 1L;
	  
	  User user  = userMapper.selectUser(id);
	  assertEquals("test1",user.getName());
	  assertEquals("kores1@daum.net",user.getEmail());
	  
	}
	
	@Ignore("User ,UserAccount inner join 으로 구성되어 테스트 안됨")
	@Test
	@DatabaseSetup("/dao/impl/mapper/UserMapperTest.xml")
	public  void insertUser()
	{
		  User user  =  new User();
		  user.setName("테스트 사용자11");
		  user.setEmail("korea1@naver.com");
		  
		  userMapper.insertUser(user);
		  
		 Long  id  = user.getId();
		 assertNotNull(id);
		 System.out.println(id);
		 
		 User  found  = userMapper.selectUser(id);
		 assertEquals(user.getName(), found.getName());
		 assertEquals(user.getEmail(), found.getEmail());
		  
		
	}
	
	@Test
	@DatabaseSetup("/dao/impl/mapper/UserMapperTest.xml")
	public  void updateUser()
	{
		Long  id = 1L;
		
		User user  = new User();

		user.setId(id);
		user.setName("update  test user");
		user.setEmail("updateset@test.com");
		
		userMapper.updateUser(user);
		
		User found  = userMapper.selectUser(id);
		assertEquals(user.getName(), found.getName());
		assertEquals(user.getEmail(), found.getEmail());
	
	}
	

	@Test
	@DatabaseSetup("/dao/impl/mapper/UserMapperTest.xml")
	public  void deleteUser()
	{
		Long id  = 1L;
		userMapper.deleteUser(id);
		
		assertNull(userMapper.selectUser(id));
		
	}
}
