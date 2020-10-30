package com.ghsoft.persistence;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.ghsoft.domain.QWebBoard;
import com.ghsoft.domain.WebBoard;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

// Querydsl을 사용하기 위해서 Querydsl을 상속받는다.
public interface WebBoardRepository 
	extends CrudRepository<WebBoard, Long>, QuerydslPredicateExecutor<WebBoard> {

	public default Predicate makePredicate(String type, String string) {
		BooleanBuilder builder = new BooleanBuilder();
		QWebBoard board = QWebBoard.webBoard;

		builder.and(board.bno.gt(0)); // board.bno > 0
		
		if(type==null) {return builder;}
		switch(type) {
		case "t" : 
			builder.and(board.title.like("%"+string+"%"));
			break;
		case "c":
			builder.and(board.title.like("%"+string+"%"));
			break;
		case "w":
			builder.and(board.title.like("%"+string+"%"));
			break;
		}
		return builder;
	}
	
	
	
}













