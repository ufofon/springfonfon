package com.oraclejava.alpha.model.search;

import lombok.Data;

@Data
public class PageSearch {
	private  int  pageNo  = 1;
	private  int limit  = 10;
	
	public  int  getStart()
	{
		int  start  = (pageNo - 1) * limit;
		
		return 0;
	}
	
	public int   getEnd()
	{
		return this.limit;
	}

}
