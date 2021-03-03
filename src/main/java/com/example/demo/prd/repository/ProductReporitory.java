package com.example.demo.prd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prd.domain.Product;

interface IProductRepository {}

public interface ProductReporitory extends JpaRepository<Product, Integer>, IProductRepository {
	
}
