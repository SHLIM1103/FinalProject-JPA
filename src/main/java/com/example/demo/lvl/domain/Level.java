package com.example.demo.lvl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.usr.domain.User;

@Entity @Table(name="levels")
public class Level {
	@Id @Column(name="level") private int level;
	
	@OneToMany(mappedBy = "level")
	private List<User> userList = new ArrayList<>();
}
