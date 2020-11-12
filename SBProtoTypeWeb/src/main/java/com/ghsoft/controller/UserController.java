package com.ghsoft.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ghsoft.domain.LoginDTO;
import com.ghsoft.domain.UserDTO;
import com.ghsoft.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	
	@Inject
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public String homeTemp(Model model) {
		model.addAttribute("homepage", "This is Home page");
		return "/temp/home";
	}

	@RequestMapping(value = "/user/signIn", method = RequestMethod.GET)
	public String userSignUp(Model model) {

		return "/user/signIn";
	}

	@RequestMapping(value = "/user/signUp", method = RequestMethod.GET)
	public String userSignInGet() throws Exception {
		return "/user/signUp";
	}

	@RequestMapping(value = "/user/signIn", method = RequestMethod.POST)
	public String userSignIn(Model model, UserDTO userDTO) throws Exception {

		userService.register(userDTO);
		return "redirect:/user/signIn";
	}

	@RequestMapping("/user/userInsert")
	public String userInsert(Model model) {
		return "/user/signIn";
	}

	@RequestMapping(value="/logedIn", method = RequestMethod.GET)
	public String userLogedIn() {
		return "/user/logedIn";
	}

	@RequestMapping(value="/user/logedIn", method = RequestMethod.POST)
	public String doLogin(LoginDTO loginDTO, Model model) throws Exception{
		UserDTO userDTO = userService.login(loginDTO);
		
		if(userDTO ==null || userDTO.getUserPw()!=loginDTO.getUserPw()) {}
		
		model.addAttribute("userId", userDTO);
		return "/user/logedIn";
		
	}
	
}
