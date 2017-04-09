package com.oraclejava.alpha.model.search;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserSearch  extends  PageSearch {

	private String name;
	private String status;
	
	public UserSearch()
	{
		super();
	}
	public UserSearch(int pageNo,int limit)
	{
		super();
		setPageNo(pageNo);
		setLimit(limit);
	}
	
	
	
}
