package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public void insert(BoardDTO boardDTO) throws Exception {
		boardDAO.insert(boardDTO);
	}

	@Override
	public void update(BoardDTO boardDTO) throws Exception {
		boardDAO.update(boardDTO);
	}

	@Override
	public void delete(Integer b_no) throws Exception {
		boardDAO.delete(b_no);
	}

	@Override
	public BoardDTO detail(Integer b_no) throws Exception {
		return boardDAO.detail(b_no);
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {
		return boardDAO.listAll();
	}

}
