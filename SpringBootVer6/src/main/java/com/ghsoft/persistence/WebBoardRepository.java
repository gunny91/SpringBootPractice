package com.ghsoft.persistence;

import org.springframework.data.repository.CrudRepository;

import com.ghsoft.domain.WebBoard;

public interface WebBoardRepository extends CrudRepository<WebBoard, Long> {
	
	
}
