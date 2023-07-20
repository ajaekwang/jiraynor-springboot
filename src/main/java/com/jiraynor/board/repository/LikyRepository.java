package com.jiraynor.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiraynor.board.entity.LikyEntity;

@Repository
public interface LikyRepository extends JpaRepository<LikyEntity, Integer> {

}
