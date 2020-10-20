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
		sqlSession.update(namespace +".updateBoard", boardDTO);
	}

	@Override
	public void delete(Integer b_no) throws Exception {
		sqlSession.delete(namespace+".deleteBoard" ,b_no);

	}

	@Override
	public BoardDTO detail(Integer b_no) throws Exception {
		return sqlSession.selectOne(namespace +".detailBoard",b_no);
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {
		return sqlSession.selectList(namespace +".listBoard");
	}

}
