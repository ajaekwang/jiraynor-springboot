package com.jiraynor.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatchUserRequestDto {

	private String userNickname;
	private String userProfile;
}
