package com.example.demo.crt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.crt.domain.Cart;

interface ICartRepository {}

public interface CartRepository extends JpaRepository<Cart, Long>, ICartRepository {

}
