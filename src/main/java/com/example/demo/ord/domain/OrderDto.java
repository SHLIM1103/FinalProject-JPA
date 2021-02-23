package com.example.demo.ord.domain;

import lombok.Data;

@Data
public class OrderDto {
	private int ordNo, usrNo, payNo, prdNo, ordAmout;
	private String ordPrice, dvrFee, ordDate, ordState;
}
