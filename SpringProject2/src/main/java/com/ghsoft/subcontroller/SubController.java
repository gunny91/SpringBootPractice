package com.ghsoft.subcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/sub")
public class SubController {
	
	
	
	@RequestMapping("/sub01")
	public String sub01() {	
		return "sub/sub01";
	}
	
	
	@RequestMapping("/sub02")
	public String sub02() {
		return "sub/sub02";
	}
	
	@RequestMapping("/sub03")
	public void sub03() {
		System.out.println("sub03() called");
		
	}
}
