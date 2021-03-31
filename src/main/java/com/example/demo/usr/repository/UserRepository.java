package com.example.demo.usr.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.usr.domain.User;

interface IUserRepository {}

public interface UserRepository extends JpaRepository<User, Long>, IUserRepository {
	public Optional<User> findByUsrEmail(String email);
    public List<User> findByUsrNoIn(List<Long> usrNo);
    public Boolean existsByUsrNickname(String nickname);
    public Boolean existsByUsrEmail(String email);
}
