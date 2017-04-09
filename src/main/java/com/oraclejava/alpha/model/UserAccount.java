package com.oraclejava.alpha.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserAccount {
	private  Long userId;
	private  String  loginId;
	private  String  password;
	private  String  status;
		
	
}
