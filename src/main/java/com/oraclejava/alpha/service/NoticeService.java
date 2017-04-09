package com.oraclejava.alpha.service;

import java.util.List;

import com.oraclejava.alpha.model.Notice;

public interface NoticeService {
	
	Long insertNotice(Notice notice);
	void updateNotice(Notice notice);
	void deleteNotice(Long id);
	
	Notice selectNotice(Long id);
	
	List<Notice>  selectNotices();
	
	
	

}
