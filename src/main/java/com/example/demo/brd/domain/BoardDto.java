package com.example.demo.brd.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class BoardDto {
	private int brdNum, rank;
	private String brdTitle, brdContent, writtenDate;
}
