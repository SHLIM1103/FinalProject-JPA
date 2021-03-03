package com.example.demo.brd.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class BoardRepositoryImpl extends QuerydslRepositorySupport implements IBoardRepository {
	private final JPAQueryFactory qf;
	private final EntityManager em;
	public BoardRepositoryImpl(JPAQueryFactory qf, EntityManager em) {
		super(Board.class);
		this.qf = qf;
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Board> findByBrdTitle(String title) {
		return em.createNamedQuery("Board.findByBrdTitle")
				.setParameter("title", title)
				.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Board> findByBrdWrtDate(String writtenDate) {
		return em.createQuery("select b from Board b where b.brdWrtDate like :brdWrtDate")
				.setParameter("writtenDate", writtenDate)
				.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BoardDto> findByUsrNo(int usrNo) {
		return em.createQuery("select "
							+ "b.brd_no brdNo "
							+ "b.brd_title brdTitle "
							+ "b.brd_content brdContent "
							+ "b.brd_wrt_date brdwrtDate "
							+ "b.brd_rank brdRank "
							+ "b.brd_img brdImg "
							+ "b.brd_kind brdKind "
							+ "b.brd_count brdCount "
							+ "b.brd_like brdLike "
							+ "brd_pwd brdPwd "
							+ "u.usr_no usrNo "
							+ "u.usr_nickname usrNickname "
							+ "from Board b inner join User u on b.usr_no = u.usr_no "
							+ "where b.usr_no like :usrNo")
				.setParameter("usrNo", usrNo)
				.getResultList();
	}
}