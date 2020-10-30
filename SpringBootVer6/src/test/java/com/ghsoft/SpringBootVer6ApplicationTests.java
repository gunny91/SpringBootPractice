package com.ghsoft;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.ghsoft.domain.WebBoard;
import com.ghsoft.persistence.WebBoardRepository;

import lombok.extern.java.Log;

@SpringBootTest
@RunWith(SpringRunner.class)
@Log
@Commit
public class SpringBootVer6ApplicationTests {

	@Autowired
	private WebBoardRepository repo;
	
	
	/**
	 * Make the 300 data list
	 */
//	@Test
//	public void insertBoard() {
//		IntStream.range(0, 300).forEach(i ->{WebBoard board = new WebBoard();
//		
//		board.setTitle("Temp"+i);
//		board.setContext("Content temp"+i);
//		board.setWriter("user0"+(i%10));
//		repo.save(board);
//	});
//	}
	
//	@Test
//	public void listTest1() {
//		Pageable pageable = PageRequest.of(0, 20, Direction.DESC, "bno");
//		Page<WebBoard> result = repo.findAll(repo.makePredicate(null, null), pageable);
//		log.info("PAGE : " + result.getPageable());
//		log.info("----------------------------------------------------------");
//		result.getContent().forEach(board -> log.info("" + board));
//		
//	}
	
	@Test
	public void listTest2() {
		Pageable pageable = PageRequest.of(0, 2, Direction.DESC, "bno");
		Page<WebBoard> result = repo.findAll(repo.makePredicate("t", "1"), pageable);
		log.info("PAGE : " + result.getPageable());
		log.info("----------------------------------------------------------");
		result.getContent().forEach(board -> log.info("" + board));
		
	}
	
}
