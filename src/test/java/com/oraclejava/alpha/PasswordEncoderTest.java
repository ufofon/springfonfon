package com.oraclejava.alpha;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class PasswordEncoderTest {
	
	@Test
	public  void  encode()
	{
        String  rawPassword  = "1234";
        
        PasswordEncoder encoder  = new BCryptPasswordEncoder();
        
        String  encoded  = encoder.encode(rawPassword);
        
        System.out.println("before : " + rawPassword);
        System.out.println("after : " + encoded);
    //  before : 1234
    //   after : $2a$10$g1rpuhZUq3/2Zzw4FcMPMuuOr4Cujjv9stgTJfsqr5l.xMeR41tR6
    //  after  : $2a$10$asHNoOH7OLOGMN7.Y7OHhuYJUfGOHlVTb9FAts/5R7m32lsuVwxQ.
        assertTrue(encoder.matches(rawPassword, encoded));   
       
        assertTrue(encoder.matches(rawPassword, "$2a$10$g1rpuhZUq3/2Zzw4FcMPMuuOr4Cujjv9stgTJfsqr5l.xMeR41tR6"));   
        
	}

}
