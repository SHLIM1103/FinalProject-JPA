package com.example.demo.brd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;

interface IBoardRepository {
	public List<Board> findByBrdTitle(String title);
	public List<Board> findByBrdWrtDate(String writtenDate);
	public List<BoardDto> findByUsrNo(int usrNo);
}

public interface BoardRepository extends JpaRepository<Board, Integer>, IBoardRepository {
	@Query("update boards set brd_title = :#{#brdTitle},"
			+ " brd_content = :#{#brdContent},"
			+ " brd_rank = :#{#brdRank},"
			+ " brd_img = :#{#brdImg}"
			+ " where brd_no = :#{#brdNo}")
	public int update(@Param("boards") Board brd);
	public List<Board> findByBrdRankAndBrdLike(String brdRank, int brdLike);
}
