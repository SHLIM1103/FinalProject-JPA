package com.example.demo.brd.service;

import java.util.List;

import com.example.demo.brd.domain.Board;

public interface BoardService {
	public List<Board> findByBrdTitle(String title);
}
