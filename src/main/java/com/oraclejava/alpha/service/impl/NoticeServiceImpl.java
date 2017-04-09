package com.oraclejava.alpha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oraclejava.alpha.dao.NoticeDao;
import com.oraclejava.alpha.model.Notice;
import com.oraclejava.alpha.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	@Transactional
	public Long insertNotice(Notice notice) {
		Long id = noticeDao.insertNotice(notice);
		return id;
	}

	@Transactional
	public void updateNotice(Notice notice) {
		
		noticeDao.updateNotice(notice);

	}
	
	@Transactional
	public void deleteNotice(Long id) {

		 noticeDao.deleteNotice(id);
	}

	public Notice selectNotice(Long id) {

		Notice notice = noticeDao.selectNotice(id);

		return notice;

	}

	public List<Notice> selectNotices() {

		List<Notice> notices = noticeDao.selectNotices();

		return notices;

	}

}
