package com.example.demo.brd.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.brd.domain.Board;

@Repository
public class BoardRepositoryImpl extends QuerydslRepositorySupport implements IBoardRepository {
	public BoardRepositoryImpl() {
		super(Board.class);
	}
}