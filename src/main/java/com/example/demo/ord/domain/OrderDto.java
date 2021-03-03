package com.example.demo.ord.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class OrderDto {
	private int ordNo, ordAmout;
	private String ordPrice, dvrFee, ordDate, ordState;
}
