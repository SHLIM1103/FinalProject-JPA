package com.example.demo.usr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.usr.domain.User;
import com.example.demo.usr.repository.UserRepository;
import com.example.demo.usr.service.UserService;
import com.example.demo.usr.service.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController extends AbstractController<User>{
	private final UserServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<Integer> save(@RequestBody User t) {
		return ResponseEntity.ok(service.save(t));
	}

	@Override
	public ResponseEntity<Integer> delete(User t) {
		return null;
	}

	@Override
	public ResponseEntity<Integer> count() {
		return null;
	}

	@Override
	public ResponseEntity<User> getOne(int id) {
		return null;
	}

	@Override
	public ResponseEntity<Optional<User>> findById(int id) {
		return null;
	}

	@Override
	public ResponseEntity<Boolean> existById(int id) {
		return null;
	}

	@Override
	public ResponseEntity<List<User>> findAll() {
		return null;
	}
}
