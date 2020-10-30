package com.ghsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/boards")
@Log
public class WebBoardController {

	
	@GetMapping("/list")
	public void showList() {
		log.info("Approched at list() ");
		
	}
}
