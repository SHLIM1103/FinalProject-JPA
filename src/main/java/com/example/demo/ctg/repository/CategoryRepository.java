package com.example.demo.ctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ctg.domain.Category;

interface ICategoryRepository {}

public interface CategoryRepository extends JpaRepository<Category, Integer>, ICategoryRepository {
	
}