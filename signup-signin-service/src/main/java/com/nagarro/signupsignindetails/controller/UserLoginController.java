package com.nagarro.signupsignindetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLoginController {

	@RequestMapping("/login")
	public String login() {

		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
