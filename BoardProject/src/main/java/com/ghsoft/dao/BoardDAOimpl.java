//package com.ghsoft.dao;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.stereotype.Repository;
//
//import com.ghsoft.dto.BoardDTO;
//
///**
// * This is the class which will access to the data base
// * @author Geonhee Cho
// *
// */
//
////@Repository("com.ghsoft.mapper.BoardMapper")
//public class BoardDAOimpl implements BoardDAO{
//	
//	@Inject
//	private SqlSession sqlSession;
//	
//	private static String namespace="com.ghsoft.mapper.BoardMapper";
//	
//	/**
//	 * Insert method from BoardDTO
//	 * @param boardDTO
//	 */
//	
//	public void insert(BoardDTO boardDTO) throws Exception {
//		sqlSession.insert(namespace +".insertBoard", boardDTO);
//	
//	}
//	
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
//		return sqlSession.selectOne(namespace +".boardDetail",b_no);
//	}
//
//	@Override
//	public List<BoardDTO> listAll() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
