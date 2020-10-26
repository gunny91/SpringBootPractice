package com.ghsoft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ghsoft.dto.BoardDTO;
import com.ghsoft.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {
	
	@Autowired
	private BoardRepository repo;
	
	/**
	 * Make the 200 data counts
	 */
	@Test
	public void inspect() {
		
		for(int i =1 ; i <=200; i++) {
			BoardDTO board = new BoardDTO();
			board.setTitle("Title : " + i);
			board.setContent("Content : "+i);
			board.setWriter("Writer : "+(i%10));
			
			repo.save(board);
		}
		
		
	}
	
	@Test
	public void testByTitle() {
		//repo.find + entity type by
		//By + column name
		repo.findBoardDTOByTitle("Title : 103").forEach(board -> System.out.println(board));
		repo.findBoardDTOByWriter("Writer : 8").forEach(board -> System.out.println(board));;
		
	}
	
}
