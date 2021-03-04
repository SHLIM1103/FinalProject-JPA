package com.example.demo.usr.domain;

import lombok.Data;

@Data
public class UserDto {
	private int usrNo;
	private String usrName, usrNickname, usrEmail, usrPwd, usrAges, usrCity, usrGender, usrPhone, usrAddr;
}
