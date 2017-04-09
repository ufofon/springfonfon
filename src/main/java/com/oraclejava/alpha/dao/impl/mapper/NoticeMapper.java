package com.oraclejava.alpha.dao.impl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.oraclejava.alpha.model.Notice;

@Mapper
public interface NoticeMapper {
	
	void insertNotice(Notice notice);
	void updateNotice(Notice notice);
	void deleteNotice(Long id);
	

	Notice selectNotice(Long id);

	List<Notice>  selectNotices();

}
