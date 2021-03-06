package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		//return "/board/success";
		return "redirect:/board/list";
	
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		
		logger.info("Entered the board list ");	
		List<BoardDTO> list = null;
		
		list =service.listAll();
		model.addAttribute("list",list);
		
		//board/list
	}
	
	//게시글 상세 조회
		@RequestMapping(value="/view", method=RequestMethod.GET)
		public void getView(@RequestParam("b_no") int b_no, Model model) throws Exception {
			logger.info("getView() Start.....");
			//b_no에 해당하는 회원정보를 가져온다.
			BoardDTO boardDTO = null;
			boardDTO = service.detail(b_no);
			logger.info(boardDTO.toString());
			
			//찾아온 회원정보를 View에 넘어갈 때 같이 보낸다.
			model.addAttribute("boardDTO", boardDTO);
		}
	
		/**
		 *  Delete board
		 *  Get the board b_no and give the b_no to service and request to delete the board
		 * 	when pressed delete, Controller -> Service -> DAO - > Mapper(SQL) - > list.jsp
		 */
		@RequestMapping(value="/delete")
		public String deleteBoard(@RequestParam("b_no") int b_no) throws Exception{
			 logger.info("delete process is started");
			 service.delete(b_no);
			 return "redirect:/board/list";
		}
		
//		@RequestMapping(value="/update", method=RequestMethod.GET)
//		public void updateGet(BoardDTO board, Model model) throws Exception{logger.info("Entered the updateGet");}

		/**
		 * 
		 * @param boardDTO
		 * @param b_title
		 * @param b_detail
		 * @return
		 * @throws Exception
		 */
		@RequestMapping(value="/update", method= {RequestMethod.POST})
		public void updateBoard(BoardDTO boardDTO ) throws Exception{
			//,@RequestParam("b_title") String b_title, @RequestParam("b_detail") String b_detail
			logger.info("Update process is started");
			logger.info("number"+boardDTO.getB_no());
			
			service.update(boardDTO);
			
			//return "redirect:board/list";
		}
	
}
