package com.ghsoft.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ghsoft.domain.CommentDTO;
import com.ghsoft.mapper.CommentMapper;

@Repository
public class CommentService {
	
	@Resource
	CommentMapper mCommentMapper;
	
	public List<CommentDTO> commentListService(int bno) throws Exception {
		return mCommentMapper.commentList(bno);
	}
	
	public int commentInsertService(CommentDTO comment) throws Exception {
		return mCommentMapper.commentInsert(comment);
	}
	
	public int commentUpdateService(CommentDTO comment) throws Exception {
		return mCommentMapper.commentUpdate(comment);
	}
	
	public int commentDeleteService(int cno) throws Exception {
		return mCommentMapper.commentDelete(cno);
	}
	

}

















