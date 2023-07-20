package com.jiraynor.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiraynor.board.dto.PatchUserRequestDto;
import com.jiraynor.board.dto.PatchUserResponseDto;
import com.jiraynor.board.dto.ResponseDto;
import com.jiraynor.board.entity.UserEntity;
import com.jiraynor.board.repository.UserRepository;

@Service
public class UserService {
	@Autowired UserRepository userRepository;
	
	public ResponseDto<PatchUserResponseDto> patchUser(PatchUserRequestDto dto, String userEmail) {
		
		UserEntity userEntity = null;
		String userNickname = dto.getUserNickname();
		String userProfile = dto.getUserProfile();
		
		try {
			userEntity = userRepository.findByUserEmail(userEmail);
			
			if(userEntity == null) return ResponseDto.setFailed("Deose Not Exist User");
			
			userEntity.setUserNickname(userNickname);
			userEntity.setUserProfile(userProfile);
			
			userRepository.save(userEntity);
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseDto.setFailed("Database Error");
		}
		
		userEntity.setUserPassword("");
		
		PatchUserResponseDto patchUserResponseDto = new PatchUserResponseDto(userEntity);
		
		return ResponseDto.setSuccess("Success", null);
	}
}
