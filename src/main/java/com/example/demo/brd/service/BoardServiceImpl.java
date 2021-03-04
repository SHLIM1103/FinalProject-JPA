package com.example.demo.brd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.repository.BoardRepository;
import com.example.demo.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BoardServiceImpl extends AbstractService<Board> implements BoardService {
	private final BoardRepository repo;

	@Override public int save(Board t) { return (repo.save(t) != null) ? 1 : 0; }
	@Override public int count() { return (int)repo.count(); }
	@Override public Board getOne(int id) { return repo.getOne(id); } // null 이 있으면 exception -> id가 있다고 확신할 때 사용 (속도가 빠름)
	@Override public Optional<Board> findById(int id) { return repo.findById(id); } // optional 이므로 null 허용 -> id가 있는지 불확실할 때 사용
	@Override public boolean existById(int id) { return repo.existsById(id); } 
	@Override public List<Board> findAll() { return repo.findAll(); }
	@Override public int delete(Board t) {
		repo.delete(t);
		return (getOne(t.getBrdNo()) == null) ? 1 : 0;
	}
}