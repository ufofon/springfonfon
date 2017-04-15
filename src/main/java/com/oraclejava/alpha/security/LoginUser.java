package com.oraclejava.alpha.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.sound.midi.Sequencer;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.oraclejava.alpha.dao.UserDao;

public class LoginUser implements UserDetails {

	private String loginId;
	private String password;
	private List<GrantedAuthority> authorities;

	public LoginUser(String loginId, String password) {
		this.loginId = loginId;
		this.password = password;
		this.authorities = new ArrayList<>();
		this.authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return this.authorities;
	}

	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.loginId;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public static LoginUser getLoginUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication.getPrincipal() instanceof LoginUser) {

			return (LoginUser) authentication.getPrincipal();
		}
		return null;
	}
}
