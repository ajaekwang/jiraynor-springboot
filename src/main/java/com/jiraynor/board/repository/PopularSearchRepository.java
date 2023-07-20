package com.jiraynor.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiraynor.board.entity.PopularSearchEntity;



@Repository
public interface PopularSearchRepository extends JpaRepository<PopularSearchEntity, String> {
	
	public List<PopularSearchEntity> findTop10ByOrderByPopularSearchCountDesc();
}
