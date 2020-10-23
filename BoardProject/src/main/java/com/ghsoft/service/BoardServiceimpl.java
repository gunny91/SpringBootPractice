//package com.ghsoft.service;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Service;
//
//import com.ghsoft.dao.BoardDAO;
//import com.ghsoft.dto.BoardDTO;
//
//
//@Service("com.ghsoft.service.BoardService")
//public class BoardServiceimpl implements BoardService {
//	
//	@Resource(name="com.ghsoft.mapper.BoardMapper")
//	private BoardDAO boardMapper;
//	
//	public int insertBoard(BoardDTO boardDTO) 	throws Exception {
//		System.out.println("Service insertBoard : " + boardDTO);
//		return boardMapper.boardInsert(boardDTO);
//	}
//	
//	//게시글 목록 보기
//	public List<BoardDTO> boardList() throws Exception {
//		System.out.println("Service boardList");
//		return boardMapper.boardList();
//	}
//	
//	
//	@Override
//	public void insert(BoardDTO boardDTO) throws Exception {
//		boardDAO.insert(boardDTO);
//
//	}
//
//	@Override
//	public void update(BoardDTO boardDTO) throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void delete(Integer b_no) throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public BoardDTO detail(Integer b_no) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<BoardDTO> listAll() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
