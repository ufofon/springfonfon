package com.oraclejava.alpha.dao;

import java.util.List;

import com.oraclejava.alpha.model.Notice;

public interface NoticeDao {

	Long insertNotice(Notice notice);

	void updateNotice(Notice notice);
	
	void deleteNotice(Long id);
	
	Notice selectNotice(Long id);
	
	
	// 인자로 검색 조건이 들어감
	List<Notice> selectNotices();


}
