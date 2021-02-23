package com.example.demo.brd.repository;

import java.util.List;

import com.example.demo.brd.domain.Board;

public interface BoardRepository {
	public int insertWritter(Board b);
	public List<Board> selectAll();
	public int update(Board b);
	public int delete(Board b);
	public Board selectById(String title);
}
