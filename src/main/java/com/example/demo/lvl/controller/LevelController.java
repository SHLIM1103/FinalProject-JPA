package com.example.demo.lvl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.lvl.domain.Level;
import com.example.demo.lvl.service.LevelServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/level")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LevelController extends AbstractController<Level> {
	private final LevelServiceImpl service;
	
	@Override
	public ResponseEntity<Integer> save(Level t) {
		return null;
	}

	@Override
	public ResponseEntity<Integer> delete(Level t) {
		return null;
	}

	@Override
	public ResponseEntity<Integer> count() {
		return null;
	}

	@Override
	public ResponseEntity<Level> getOne(int id) {
		return null;
	}

	@Override
	public ResponseEntity<Optional<Level>> findById(int id) {
		return null;
	}

	@Override
	public ResponseEntity<Boolean> existById(int id) {
		return null;
	}

	@Override
	public ResponseEntity<List<Level>> findAll() {
		return null;
	}

}
