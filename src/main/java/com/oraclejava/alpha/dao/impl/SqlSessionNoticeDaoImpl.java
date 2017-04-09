package com.oraclejava.alpha.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oraclejava.alpha.dao.NoticeDao;
import com.oraclejava.alpha.dao.impl.mapper.NoticeMapper;
import com.oraclejava.alpha.model.Notice;



//@Repository
public class SqlSessionNoticeDaoImpl  implements  NoticeDao {

	@Autowired
	private  SqlSessionFactory  sqlSessionFactory;
	
	public Long insertNotice(Notice notice) {
		return null;
	}

	public void updateNotice(Notice notice) {
		
	}

	public void deleteNotoce(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Notice selectNotice(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Notice> selectNotice() {
		SqlSession  sqlSession  = this.sqlSessionFactory.openSession();
		//Connection 객체 역활

		//ibatis
	/*	List<Notice>  noticeList  = sqlSession.selectList("com.oraclejava.alpha.dao.impl.mapper.NoticeMapper.selectNotices");
		*/
		
		NoticeMapper  noticeMapper = sqlSession.getMapper(NoticeMapper.class);
		List<Notice>  noticeList = noticeMapper.selectNotices();
		return noticeList;
	}

	@Override
	public List<Notice> selectNotices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNotice(Long id) {
		// TODO Auto-generated method stub
		
	}

}
