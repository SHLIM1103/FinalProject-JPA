package com.example.demo.prd.service;

import java.util.List;

import com.example.demo.prd.domain.Product;

public interface ProductService {
	public List<Product> findByPrdNo(long prdNo);
	public List<Product> findByCtgName(String ctgName);
	public String deleteById(long prdNo);
//	public long update(String prdName, String ctgName, String prdPrice, String prdInv, String prdImg, long prdNo);
}