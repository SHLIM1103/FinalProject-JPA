package com.example.demo.brd.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.pay.domain.Payment;
import com.example.demo.prd.domain.Product;
import com.example.demo.rpl.domain.Reply;
import com.example.demo.usr.domain.User;

import lombok.Getter;

@Entity @Getter
public class Board {
   @Id @Column(name="brd_no") @GeneratedValue(strategy = GenerationType.IDENTITY) private int brdNo;
   @Column(name="brd_Title") private String brdTitle;
   @Column(name="brd_content") private String brdContent;
   @Column(name="brd_wrt_date") private String brdWrtDate;
   @Column(name="brd_rank") private String brdRank;
   @Column(name="brd_img") private String brdImg;
   @Column(name="usr_nickname") private String usrNickname;
   @Column(name="brd_kind") private int brdKind;
   @Column(name="brd_count") @GeneratedValue(strategy = GenerationType.IDENTITY) private int count;
   @Column(name="brd_like") private String brdLike;
   @Column(name="brd_pwd") private String brdPwd;
   
   @OneToMany(mappedBy="board")
   private List<Reply> replyList = new ArrayList<>();
   
   @ManyToOne
   @JoinColumn(name="usr_no")
   private User user;
   
   @ManyToOne
   @JoinColumn(name="pay_no")
   private Payment payment;
   
   @ManyToOne
   @JoinColumn(name="prd_no")
   private Product product;
}