package com.oraclejava.alpha.dao.impl.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.alpha.model.User;
import com.oraclejava.alpha.model.search.UserSearch;

public class UserMapperTest {

	private ApplicationContext ctx;
	private UserMapper userMapper;

	@Before
	public void setup() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.userMapper = ctx.getBean(UserMapper.class);

	}

	@Ignore("테스트  나중에 테스트11~~~")
	@Test
	public void insertUser() {
		// UserMapper userMapper = ctx.getBean(UserMapper.class);

		assertNotNull(userMapper);

		// 준비
		User user = new User();
		user.setName("king~~~");
		user.setEmail("korea@ddd.com");

		// 수행
		userMapper.insertUser(user);
		// 검증
		assertNotNull(user.getId());
		/*
		 * System.out.println("테스트  동작111~~~~"); assertTrue(true);
		 */
	}

	@Ignore("테스트  나중에 테스트22~~~")
	@Test
	public void updateUser() {
		User user = new User();
		user.setId(new Long(3L));
		user.setName("seoul45n");
		user.setEmail("ddsd_king@naver.com");

		userMapper.updateUser(user);

		System.out.println("테스트  동작222~~~~");
		/* fail(); */
	}

	@Test
	public void selectUser() {

		Long id = 1L;

		User user = userMapper.selectUser(id);
		/*
		 * if("update user".equals(user.getName())){ }
		 */

		assertNotNull(user);
		assertEquals("update user", user.getName());
		assertEquals("utest@test.com", user.getEmail());

		assertNotNull(user.getUserAccount());
		assertEquals("user11", user.getUserAccount().getLoginId());
		assertEquals("ACTIVE", user.getUserAccount().getStatus());

	}

	@Ignore
	@Test
	public void testSelectList() {
		String name = "us";
		String status = "ACTIVE";

		UserSearch userSearch = new UserSearch();
		userSearch.setName(name);
		userSearch.setStatus(status);

		List<User> users = userMapper.selectUsers(userSearch);
		assertEquals(1, users.size());
	}

	@Ignore
	@Test
	public void testSelectUsersCount() {
		String name = "us";
		String status = "ACTIVE";

		UserSearch userSearch = new UserSearch();
		userSearch.setName(name);
		userSearch.setStatus(status);

		assertEquals(1, userMapper.selectUsersCount(userSearch));
	}

}
