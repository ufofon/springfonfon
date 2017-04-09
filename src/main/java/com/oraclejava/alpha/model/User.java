package com.oraclejava.alpha.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	
	private  Long id;
	private  String  name;
	private  String  email;
		
    private  UserAccount  userAccount;
}
