package com.example.demo.pay.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class PaymentDto {
    private long payNo, payAmount;
    private String payPrice, dvrFee, payDate, payState;
}