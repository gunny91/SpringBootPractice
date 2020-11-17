package com.ghsoft.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ghsoft.domain.BoardDTO;
import com.ghsoft.domain.FileDTO;
import com.ghsoft.mapper.BoardMapper;

@Repository
public class BoardService {

	@Resource
	BoardMapper mBoardMapper;
	
	//게시글 등록
	public int boardInsertService(BoardDTO board) throws Exception {
		return mBoardMapper.boardInsert(board);
	}
	
	//게시글 목록 보기
	public List<BoardDTO> boardListService() throws Exception {
		return mBoardMapper.boardList();
	}
	
	//게시글 상세정보
	public BoardDTO boardDetailService(int bno) throws Exception {
		return mBoardMapper.boardDetail(bno);
	}
	
	//게시글 수정
	public int boardUpdateService(BoardDTO board) throws Exception {
		System.out.println("BNO     : " + board.getBno());
		System.out.println("SUBJECT : " + board.getSubject());
		System.out.println("CONTENT : " + board.getContent());
		return mBoardMapper.boardUpdate(board);
	}
	
	//게시글 삭제
	public int boardDeleteService(int bno) throws Exception {
		return mBoardMapper.boardDelete(bno);
	}
	
	//파일 올리기
	public int fileInsertService(FileDTO file) throws Exception {
		return mBoardMapper.fileInsert(file);
	}
	
	public FileDTO fileDetailService(int bno) throws Exception {
		return mBoardMapper.fileDetail(bno);
	}
	
}





















