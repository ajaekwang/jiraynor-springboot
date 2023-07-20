package com.jiraynor.board.entity;

import java.util.Date;

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
@Entity(name="Board")
@Table(name="Board")
public class BoardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardNumber;
	private String boardTitle;
	private String boardContent;
	private String boardImage;
	private String boardVideo;
	private String boardFile;
	private String boardWriterEmail;
	private String boardWriterProfile;
	private String boardWriterNickname;
	private Date boardWriteDate;
	private int boardClickCount;
	private int boardLikeCount;
	private int boardCommentCount;
}
