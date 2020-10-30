package com.ghsoft.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ghsoft.domain.MemberDTO;

@Controller
public class ThymeleafController {

	@GetMapping("/thymeleaf1")
	public void thymeleaf1(Model model) {
		model.addAttribute("greeting","Hello!");
		
	}
	
	@GetMapping("/thymeleaf2")
	public void thymeleaf2(Model model) {
		MemberDTO dto = new MemberDTO(123,"u00","p0", "Gunny",  new Timestamp(System.currentTimeMillis()));
				model.addAttribute("dto", dto);
				
	}
	
	
	@GetMapping("/thymeleaf3")
	public void thymeleaf3(Model model){
		List<MemberDTO> list = new ArrayList<>();
		for(int i = 0 ; i <10; i ++) {
			list.add(new MemberDTO(123,"u00"+i,"p0"+i , "Gunny",  new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list",list);
	}

	@GetMapping("/thymeleaf4")
	public void thymeleaf4(Model model){
		List<MemberDTO> list = new ArrayList<>();
		for(int i = 0 ; i <10; i ++) {
			list.add(new MemberDTO(321,"u0"+i%3,"p12"+i%3, "guu12"+i%3,  new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list",list);
	}
	
	@GetMapping("/thymeleaf5")
	public void sample3(Model model) {
		String result = "Success";
		model.addAttribute("result",result);
	}
	
	
	
	@GetMapping("/sample6")
	public void sample6(Model model) {

		List<MemberDTO> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			list.add(new MemberDTO(i, "u0" + i, "p0" + i, "홍길동" + i,
					new Timestamp(System.currentTimeMillis())));
		}

		model.addAttribute("list", list);

		String result = "SUCCESS";

		model.addAttribute("result", result);

	}
	
	
	@GetMapping("/sample7")
	public void sample7(Model model) {

		model.addAttribute("now", new Date());
		model.addAttribute("price", 123456789);
		model.addAttribute("title", "This is a just sample.");
		model.addAttribute("options", Arrays.asList("AAAA","BBB","CCC","DDD"));
		
	}
	
	@GetMapping("/sample8")
	public void sample8(Model model) {
		
	}
	
	@GetMapping("/sample9")
	public void sample9(Model model) {
		
	}
	
	@GetMapping("/sample/temp")
	public void temp() {
		
	}
	
	
}