package com.example.demo.crt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.crt.domain.Cart;
import com.example.demo.crt.repository.CartRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class CartServiceImpl extends AbstractService<Cart> implements CartService {
	private final CartRepository repo;

	@Override public int save(Cart t) { return (repo.save(t) != null) ? 1 : 0; }
	@Override public int count() { return (int)repo.count(); }
	@Override public Cart getOne(int id) { return repo.getOne(id); }
	@Override public Optional<Cart> findById(int id) { return repo.findById(id); }
	@Override public boolean existById(int id) { return repo.existsById(id); }
	@Override public List<Cart> findAll() { return repo.findAll(); }
	@Override 
	public int delete(Cart t) {
		repo.delete(t);
		return (getOne(t.getCartNo()) == null) ? 1 : 0;
	}
}