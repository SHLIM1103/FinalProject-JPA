package com.example.demo.usr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.usr.domain.User;

interface IUserRepository {}

public interface UserRepository extends JpaRepository<User, Integer>, IUserRepository {
	
}
