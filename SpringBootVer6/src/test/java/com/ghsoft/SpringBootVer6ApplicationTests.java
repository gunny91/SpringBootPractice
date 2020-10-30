package com.ghsoft;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
	@Test
	public void insertBoard() {
		IntStream.range(0, 300).forEach(i ->{WebBoard board = new WebBoard();
		
		board.setTitle("Temp"+i);
		board.setContext("Content temp"+i);
		board.setWriter("user0"+(i%10));
		repo.save(board);
	});
	}
}
