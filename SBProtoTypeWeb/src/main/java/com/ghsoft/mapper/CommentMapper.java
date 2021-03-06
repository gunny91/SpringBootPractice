package com.ghsoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ghsoft.domain.CommentDTO;

@Mapper
public interface CommentMapper {
	// 댓글의 개수를 구한다.
	public int commentCount() throws Exception;

	// 댓글 목록
	public List<CommentDTO> commentList(int bno) throws Exception;

	// 댓글 등록
	public int commentInsert(CommentDTO comment) throws Exception;

	// 댓글 수정
	public int commentUpdate(CommentDTO comment) throws Exception;

	// 댓글 삭제
	public int commentDelete(int cno) throws Exception;
}
