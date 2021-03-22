package com.example.demo.prd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.prd.domain.Product;

interface IProductRepository {}

public interface ProductReporitory extends JpaRepository<Product, Long>, IProductRepository {
	@Query(value = "update Product set prd_name = :prdName, "
			+ " price = :price, "
			+ " where prd_no = :prdNo", nativeQuery = true)
	public int update(@Param("prdName") String prdName, @Param("price") String price, @Param("prdNo") int prdNo);
}
