package com.example.demo.usr.repository;

import com.example.demo.usr.domain.User;

public interface UserRepository {
	public int insert(User m);
	public User selectById(User m);
	public int update(User m);
	public int delete(User m);
}
