package com.example.demo.ctg.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.prd.domain.Product;

import lombok.Getter;

@Entity @Getter
public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ctg_no") private long ctgNo;
	@Column(name="ctg_name") private String ctgName;

	@OneToMany(mappedBy = "category")
	private List<Product> productList = new ArrayList<>();
}