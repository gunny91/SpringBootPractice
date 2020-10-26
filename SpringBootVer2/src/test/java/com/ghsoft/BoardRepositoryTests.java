package com.ghsoft;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.PrintStream;
import java.util.Optional;
import java.util.stream.Stream;

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
	private final PrintStream standardOut = System.out;
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void inspect() {
		//check the real class name
		Class<?> temp = boardRepo.getClass();
		System.out.println(temp.getName());
		
		//Check the list of interface
		Class<?>[] interfaces =temp.getInterfaces();
		System.out.println("interfaces");
		Stream.of(interfaces).forEach(inter ->System.out.println(inter.getName()));
		
		
		//Check the Parents class
		Class<?> superClasses = temp.getSuperclass();
		System.out.println("SuperClass");
		System.out.println(superClasses.getName());
	}
	
	@Test
	public void insertionTest() {
		
		BoardDTO board = new BoardDTO();
	
		board.setTitle("Test8 Title");
		board.setContent("Run test 12");
		board.setWriter("Gunny1212 Cho");
		
		boardRepo.save(board);
		
		// assertEquals( "the expected output\n", board.toString() );
	}
	
	/**
	 * Find by id (bno)
	 */
	@Test
	public void readTest() {
		
		Optional<BoardDTO> board =  boardRepo.findById(6L);
		//assertEquals( "the expected output\n", board.toString() );
		System.out.println(board);
	}
	
	@Test
	public void updateTest() {
		BoardDTO board = boardRepo.findById(12L).orElse(null);
		//assertEquals( "the expected output\n", board.toString() );
		board.setTitle("Updated to 12");
		boardRepo.save(board);
		assertEquals( "the expected output\n", board.toString() );
		//System.out.println(board);
	}
	
}
