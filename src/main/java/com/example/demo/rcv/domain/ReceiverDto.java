package com.example.demo.rcv.domain;

import lombok.Data;

@Data
public class ReceiverDto {
	private int rcvNo, ordNo;
    private String usrEmail, rcvName, rcvPhone, rcvAddr;
}
