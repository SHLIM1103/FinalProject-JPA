package com.example.demo.lvl.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Level;

@Repository
public class LevelRepositoryImpl extends QuerydslRepositorySupport implements ILevelRepository {
	public LevelRepositoryImpl() {
		super(Level.class);
	}
}
