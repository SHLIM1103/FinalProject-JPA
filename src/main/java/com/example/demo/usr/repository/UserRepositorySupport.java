package com.example.demo.usr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.usr.domain.QUser;
import com.example.demo.usr.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepositorySupport extends QuerydslRepositorySupport implements IUserRepository {
	
	private final JPAQueryFactory jpaqueryFactory;
	public UserRepositorySupport(JPAQueryFactory jpaqueryFactory) {
		super(User.class);
		this.jpaqueryFactory = jpaqueryFactory;
	}
	
	public List<User> test(String name) {
		QUser user = QUser.user;
		return jpaqueryFactory.selectFrom(user).fetch();
	}
}
