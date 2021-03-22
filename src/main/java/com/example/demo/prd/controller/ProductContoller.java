package com.example.demo.prd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<Long> save(@RequestBody Product t) {
		System.out.println("저장됨" + t.toString());
		return ResponseEntity.ok(service.save(t));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Long> delete(Product t) {
		return ResponseEntity.ok(service.delete(t));
	}
	
	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		return ResponseEntity.ok(service.count());
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getOne(long id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Product>> findById(long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existById(long id) {
		return ResponseEntity.ok(service.existById(id));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAll() {
//		List<Product> ls = service.findAll();
//		for(int i = 0; i< ls.size(); i++) {
//			if(i < 5) {
//				System.out.println(ls.get(i).getPrdName());
//			}
//		}
		return ResponseEntity.ok(service.findAll());
	}
}