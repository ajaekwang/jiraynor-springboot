package com.jiraynor.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiraynor.board.dto.ResponseDto;
import com.jiraynor.board.entity.BoardEntity;
import com.jiraynor.board.entity.PopularSearchEntity;
import com.jiraynor.board.service.BoardService;

@RestController
@RequestMapping("/api/board")
public class BoardController {
	
	@Autowired BoardService boardService;
	
	@GetMapping("/top3")
	public ResponseDto<List<BoardEntity>> getTop3() {
		
		return boardService.getTop3();
	}
	
	@GetMapping("/list")
	public ResponseDto<List<BoardEntity>> getList() {
		return boardService.getList();
	}
	
	@GetMapping("/popularSearchList")
	public ResponseDto<List<PopularSearchEntity>> getPopularSearchEntity() {
		return boardService.getPopularSearchList();
	}
	
	@GetMapping("/search/{boardTitle}")
	public ResponseDto<List<BoardEntity>> getSearchList(@PathVariable("boardTitle") String title) {
		return null;
	}
	
}
