package com.example.demo.crt.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.crt.domain.Cart;

@Repository
public class CartRepositoryImpl extends QuerydslRepositorySupport implements ICartRepository {
	public CartRepositoryImpl() {
		super(Cart.class);
	}
}