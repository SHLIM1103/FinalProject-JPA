package com.example.demo.rpl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.brd.domain.Board;
import com.example.demo.usr.domain.User;

import lombok.Getter;

@Entity @Getter
public class Reply {
	   @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	   @Column(name="rpl_no") private long rplNo;
	   @Column(name="rpl_content") private String rplContent;
	   
	   @ManyToOne
	   @JoinColumn(name="brd_no")
	   private Board board;

	   @ManyToOne
	   @JoinColumn(name = "usr_no")
	   private User user;
}
