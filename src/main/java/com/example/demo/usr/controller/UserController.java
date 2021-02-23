package com.example.demo.usr.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.usr.domain.User;
import com.example.demo.usr.repository.UserRepository;
import com.example.demo.usr.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class UserController {
	final UserRepository userRepository;
	final UserService userService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("/join")
	public Map<?,?> join(@RequestBody User m) {
		var map = new HashMap<>();
        map.put("message", (userService.join(m) == 1) ? "SUCCESS" : "FAILURE");
		return map;
	}
	
	@PostMapping("/login")
	public Map<?,?> login(@RequestBody User m){
		var map = new HashMap<>();
		User result = userService.login(m);
        map.put("message", result != null ? "SUCCESS" : "FAILURE");
        map.put("sessionMember", result);
		logger.info("로그인: "+ m.toString());
        return map;
	}
	
	@PutMapping("/modify")
	public Map<?,?> modify(@RequestBody User m){
		var map = new HashMap<>();
		map.put("message", (userService.modify(m) == 1? "SUCCESS" : "FAILURE"));
		logger.info("수정한 회원정보: "+ m.toString());
		return map;
	}
	
	@DeleteMapping("/withdrawal")
	public Map<?,?> withdrawal(@RequestBody User m){
		var map = new HashMap<>();
		logger.info("탈퇴한 회원: "+ m.toString());
		map.put("message", (userService.withdrawal(m) == 1? "SUCCESS" : "FAILURE"));
		return map;
	}
}
