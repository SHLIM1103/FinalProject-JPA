package com.example.demo.brd.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class BoardDto {
	private long brdNo, brdKind, brdCount;
	private String brdTitle, brdContent, brdWrtDate, brdRank, brdImag, brdLike, brdPwd;
	
	private long usrNo;
	private String usrNickname;
}
