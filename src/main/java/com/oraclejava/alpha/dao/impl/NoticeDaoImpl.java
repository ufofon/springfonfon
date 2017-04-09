package com.oraclejava.alpha.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oraclejava.alpha.dao.NoticeDao;
import com.oraclejava.alpha.dao.impl.mapper.NoticeMapper;
import com.oraclejava.alpha.model.Notice;

@Repository
public class NoticeDaoImpl implements NoticeDao {

	@Autowired
	private NoticeMapper noticeMapper;

	public Long insertNotice(Notice notice) {
		// TODO Auto-generated method stub

		noticeMapper.insertNotice(notice);
		return notice.getId();
	}

	public void updateNotice(Notice notice) {
		// TODO Auto-generated method stub
		noticeMapper.updateNotice(notice);

	}

	public void deleteNotice(Long id) {
		// TODO Auto-generated method stub
		noticeMapper.deleteNotice(id);

	}

	

	@Override
	public Notice selectNotice(Long id) {
		Notice  notice = noticeMapper.selectNotice(id);
		
		return notice;
	}

	@Override
	public List<Notice> selectNotices() {
	  List<Notice>  noticeList  = noticeMapper.selectNotices();
		
		// TODO Auto-generated method stub
		return noticeList;
	}


}
