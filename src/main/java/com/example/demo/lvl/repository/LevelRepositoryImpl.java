package com.example.demo.lvl.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import ch.qos.logback.classic.Level;

@Repository
public class LevelRepositoryImpl extends QuerydslRepositorySupport implements ILevelRepository {
	private JPAQueryFactory qf;
	public LevelRepositoryImpl(JPAQueryFactory qf) {
		super(Level.class);
		this.qf = qf;
	}
}
