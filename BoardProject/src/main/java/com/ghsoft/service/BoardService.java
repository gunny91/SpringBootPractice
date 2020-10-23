package com.ghsoft.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ghsoft.dto.BoardDTO;
import com.ghsoft.mapper.BoardMapper;

@Service("com.ghsoft.service.BoardService")
public class BoardService {
	
		
		@Resource(name="com.ghsoft.mapper.BoardMapper")
		private BoardMapper boardMapper;
		
		public int insertBoard(BoardDTO boardDTO) 	throws Exception {
			System.out.println("Service insertBoard : " + boardDTO);
			return boardMapper.boardInsert(boardDTO);
		}
		
		//게시글 목록 보기
		public List<BoardDTO> boardList() throws Exception {
			System.out.println("Service boardList");
			return boardMapper.boardList();
		}
		
		public int 	boardUpdate(BoardDTO boardDTO) 	throws Exception {
			return boardMapper.boardUpdate(boardDTO);
		}
		
		public int 	boardDelete(Integer b_no)		throws Exception {
			return boardMapper.boardDelete(b_no);
		}
		
		public BoardDTO	boardDetail(int b_no)		throws Exception {
			System.out.println("Service detail b_no : " + b_no);
			return boardMapper.boardDetail(b_no);
		}
}
