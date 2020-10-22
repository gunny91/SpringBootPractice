package com.ghsoft.service;

import java.util.List;

import com.ghsoft.dto.BoardDTO;


public interface BoardService {
	public void insert(BoardDTO boardDTO) throws Exception;
	public void update(BoardDTO boardDTO) throws Exception;
	public void delete(Integer b_no) throws Exception;
	public BoardDTO detail (Integer b_no) throws Exception;
	public List<BoardDTO> listAll() throws Exception;
}
