package com.oraclejava.alpha.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.DivideOperator;
import org.springframework.stereotype.Repository;

import com.oraclejava.alpha.dao.NoticeDao;
import com.oraclejava.alpha.model.Notice;

//@Repository
public class JdbcNoticeDaoImpl implements NoticeDao {

	private Connection connection;

	public JdbcNoticeDaoImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oraclejava", "ojuser", "ojuser");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Long insertNotice(Notice notice) {
		// JDBC 를 이용해서 DB 통신

		System.out.println("insert  notice  to DB");
		return null;
	}

	public void updateNotice(Notice notice) {

	}

	public void deleteNotoce(Long id) {

	}

	public Notice selectNotice(Long id) {
		return null;
	}

	public List<Notice> selectNotice() {

		System.out.println("select  notices  to DB");

		String sql = "select  id,title,contents  from  tb_notice";

		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			List<Notice> noticeList = new ArrayList<Notice>();

			while (rs.next()) {
				Notice notice = new Notice();
				notice.setId(rs.getLong("id"));
				notice.setTitle(rs.getString("title"));
				notice.setContents(rs.getString("contents"));

				noticeList.add(notice);

			}

			return noticeList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

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
