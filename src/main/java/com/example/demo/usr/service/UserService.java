package com.example.demo.usr.service;

import com.example.demo.usr.domain.User;

public interface UserService {
	public int join(User m) ;
	public User login(User m);
	public int modify(User m);
	public int withdrawal(User m);
	public User getMember(String memid);

}
