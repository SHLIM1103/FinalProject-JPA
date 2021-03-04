package com.example.demo.usr.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.usr.domain.User;

@Repository
public class UserRepositoryImpl extends QuerydslRepositorySupport implements IUserRepository {
	public UserRepositoryImpl() {
		super(User.class);
	}
}
