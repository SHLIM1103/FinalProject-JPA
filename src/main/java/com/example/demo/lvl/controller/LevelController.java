package com.example.demo.lvl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/save")
	public ResponseEntity<Integer> save(Level t) {
		return ResponseEntity.ok(service.save(t));
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Integer> delete(Level t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Level> getOne(@PathVariable int id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Level>> findById(@PathVariable int id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existById(@PathVariable int id) {
		return ResponseEntity.ok(service.existById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Level>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
}
