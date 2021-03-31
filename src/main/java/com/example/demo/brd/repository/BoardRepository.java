package com.example.demo.brd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.brd.domain.Board;

interface IBoardRepository { }

public interface BoardRepository extends JpaRepository<Board, Long>, IBoardRepository {
	@Query(value = "update Board set brd_title = :brdTitle, "
			+ " brd_content = :brdContent, "
			+ " where brd_no = :brdNo", nativeQuery = true)
	public int update(@Param("brdTitle") String brdTitle, @Param("brdContent") String brdContent, @Param("brdNo") int brdNo);
}