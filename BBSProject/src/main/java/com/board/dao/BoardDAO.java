package com.board.dao;

import java.util.List;

import com.board.dto.BoardDTO;

public interface BoardDAO {

	public void insert(BoardDTO boardDTO) throws Exception;
	public void update(BoardDTO boardDTO) throws Exception;
	public void delete(Integer b_no) throws Exception;
	public BoardDTO detail (Integer b_no) throws Exception;
	public List<BoardDTO> listAll() throws Exception;

}
