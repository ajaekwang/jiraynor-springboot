package com.jiraynor.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Liky")
@Table(name="Liky")
public class LikyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int likeId;
	private int boardNumber;
	private String userEmail;
	private String likeUserPrifile;
	private String likeUserNickname;
	

}
