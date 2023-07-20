package com.jiraynor.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiraynor.board.dto.ResponseDto;
import com.jiraynor.board.dto.SignInDto;
import com.jiraynor.board.dto.SignInResponseDto;
import com.jiraynor.board.dto.SignUpDto;
import com.jiraynor.board.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	AuthService authService;
	
	@PostMapping("/signUp")
	public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody) {
		ResponseDto<?> result = authService.signUp(requestBody);
		return result;
	}
	
	@PostMapping("/signIn")
	public ResponseDto<SignInResponseDto> signIn(@RequestBody SignInDto requestBody) {
		ResponseDto<SignInResponseDto> result = authService.signIn(requestBody);
		return result;
	}
}
