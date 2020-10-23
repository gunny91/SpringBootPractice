package com.ghsoft.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ghsoft.dto.BoardDTO;
import com.ghsoft.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	

	 @Inject
	BoardService boardService;
//	
	//웹 브라우저에서 http://localhost:8099/board/insert로 호출한다.
		//게시글 등록화면으로 이동한다.
		@RequestMapping("/insert")
		private String insertForm() {
			return "/board/insert";
		}
		
//	@RequestMapping("/insert")
//	private String insertForm() {
//		return "/board/insert";
//	}
//	
//	
//	@RequestMapping(value="/insert", method=RequestMethod.POST)
//	public String insertPOST(BoardDTO board, Model model) throws Exception {
//		boardService.insertBoard(board);
//
//		return "/board/insert";
//	}
	
	 
	//게시글 등록
		@RequestMapping(value="/insert", method=RequestMethod.POST)
		public String insertPOST(BoardDTO boardDTO, Model model) throws Exception {
			System.out.println("Controller insertPOST : " + boardDTO);
			boardService.insertBoard(boardDTO);
			return "redirect:/board/list";
			//return "/board/list";
		}

		//게시글 목록 보여주기
		@RequestMapping("/list")
		private String boardList(Model model) throws Exception {
			System.out.println("Controller boardList Before");
			//게시글 목록 보여주기 화면으로 가기 전에 보여줄 데이터를 가져와서 model에 담든다.
			model.addAttribute("list", boardService.boardList());
			System.out.println("Controller boardList After");
			return "/board/list";
		}
		
		//게시글 상세 조회
		@RequestMapping(value="/view", method=RequestMethod.GET)
		//public void getView(@RequestParam("b_no") int b_no, Model model) throws Exception {
		public String getView(@RequestParam("b_no") int b_no, Model model) throws Exception {
			System.out.println("Controller getView Before");
			//b_no에 해당하는 회원정보를 가져온다.
			BoardDTO boardDTO = null;
			boardDTO = boardService.boardDetail(b_no);
			
			//찾아온 회원정보를 View에 넘어갈 때 같이 보낸다.
			model.addAttribute("boardDTO", boardDTO);
			return "/board/view";
		}
		
		//게시글 삭제
		//삭제할 게시번호를 받아서 서비스한테 게시번호를 주고 삭제작업을 의뢰한다.
		@RequestMapping("/delete")
		public String delete(@RequestParam("b_no") int b_no) throws Exception {
			System.out.println("Controller delete Before");
			boardService.boardDelete(b_no);
			return "redirect:/board/list";
		}
		
		@RequestMapping("/update")
		public String update(BoardDTO boardDTO) throws Exception {
			System.out.println("Controller delete Before");
			boardService.boardUpdate(boardDTO);
			return "redirect:/board/list";
		}

		
}
