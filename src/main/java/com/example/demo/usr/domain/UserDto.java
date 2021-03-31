package com.example.demo.usr.domain;

import java.util.Collection;
import java.util.Objects;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component @Lazy @Getter
public class UserDto {
	private static final long serialVersionUID = 1L;
	
	private long usrNo;
	private String usrName, usrNickname, usrId, usrEmail, usrPwd, usrAges, usrCity, usrGender, usrPhone, usrAddr;
	
	/*
	 private Collection<? extends GrantedAuthority> authorities;
	 
	
	public UserDto(long usrNo, String usrName, String usrNickname, String usrEmail, String usrPwd, String usrPhone,
			Collection<? extends GrantedAuthority> authorities) {
		this.usrNo = usrNo;
		this.usrName = usrName;
		this.usrNickname = usrNickname;
		this.usrEmail = usrEmail;
		this.usrPwd = usrPwd;
		this.usrPhone = usrPhone;
		this.authorities = authorities;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDto that = (UserDto) o;
		return Objects.equals(usrNo, that.usrNo);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(usrNo);
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}
	*/
}
