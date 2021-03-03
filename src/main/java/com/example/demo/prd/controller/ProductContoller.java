package com.example.demo.prd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.prd.domain.Product;
import com.example.demo.prd.service.ProductServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductContoller extends AbstractController<Product> {
	private final ProductServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<Integer> save(Product t) {
		return ResponseEntity.ok(service.save(t));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Integer> delete(Product t) {
		return ResponseEntity.ok(service.delete(t));
	}
	
	@GetMapping("/count")
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Product>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existById(int id) {
		return ResponseEntity.ok(service.existById(id));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
}