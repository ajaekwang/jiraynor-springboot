package com.jiraynor.board.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiraynor.board.entity.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
	
	public List<BoardEntity> findTop3ByBoardWriteDateAfterOrderByBoardLikeCountDesc(Date boardWriteDate);
	
	public List<BoardEntity> findByOrderByBoardWriteDateDesc();
	
	public List<BoardEntity> findByBoardTitleContains(String boardTitle);
	
}
