package com.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.dto.BoardDTO;
import com.board.service.BoardService;

/**
 * 
 * @author Geonhee Cho
 *	URL request when it started with /board, then handle it from here!
 */
@Controller
@RequestMapping("/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public void insertGet(BoardDTO board, Model model) throws Exception{logger.info("Entered the insertGet");}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertPost(BoardDTO board, Model model) throws Exception{
		logger.info("Entered the insertPost ");
		logger.info(board.toString());
		
		service.insert(board);
		model.addAttribute("result", "Board Registration is completed");
		
		return "/board/success";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		
		logger.info("Entered the board list ");	
		service.listAll();
		model.addAttribute("result", "Board list is Ready");
		//board/list
	}
	
	
	
	
	
	
}
