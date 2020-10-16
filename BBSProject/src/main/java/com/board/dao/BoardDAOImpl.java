package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace="com.board.mapper.BoardMapper";
	
	@Override
	public void insert(BoardDTO boardDTO) throws Exception {
		sqlSession.insert(namespace +".insertBoard", boardDTO);
	
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
	public BoardDTO select(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
