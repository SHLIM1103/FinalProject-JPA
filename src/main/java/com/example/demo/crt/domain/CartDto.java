package com.example.demo.crt.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class CartDto {
	   private int cartNo, carAmount;
	   
	   private int usrNo, prdNo;
}
