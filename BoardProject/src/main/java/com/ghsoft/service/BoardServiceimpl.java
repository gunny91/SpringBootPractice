package com.ghsoft.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ghsoft.dao.BoardDAO;
import com.ghsoft.dto.BoardDTO;


@Service
public class BoardServiceimpl implements BoardService {
	
	 @Inject
	private BoardDAO boardDAO;
	
	@Override
	public void insert(BoardDTO boardDTO) throws Exception {
		boardDAO.insert(boardDTO);

	}

	@Override
	public void update(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer b_no) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardDTO detail(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
