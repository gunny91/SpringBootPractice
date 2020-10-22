package com.ghsoft.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ghsoft.dto.BoardDTO;
import com.ghsoft.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	

	 @Inject
	BoardService boardService;
//	
	
	@RequestMapping("/insert")
	private String insertForm() {
		return "/board/insert";
	}
	
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertPOST(BoardDTO board, Model model) throws Exception {
		boardService.insert(board);

		return "/board/insert";
	}
	
}
