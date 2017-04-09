package com.oraclejava.alpha.model.search;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {
	private  List<T>  results;
	private  PageSearch  search;
	private  int  totalCount;
	
	public PageResult(PageSearch  search)
	{
		this.search  = search;
		this.results  = new ArrayList<>();
		this.totalCount  = 0;
	}

	public PageResult(PageSearch  search, List<T> result,int totalCount )
	{
		this.search  = search;
		this.results  = new ArrayList<>();
		this.totalCount  = totalCount;
		
	}
}
