package com.nagarro.signupsignindetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.signupsignindetails.dto.UserRegistrationDto;
import com.nagarro.signupsignindetails.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private  UserService userService;

	public UserRegistrationController(UserService userservice) {
		super();
		this.userService = userservice;
	}
	
	@PostMapping
	public String  registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.Save(registrationDto);
		return"redirect:/registration?success";
	}
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto  userRegistrationDto() {
		return new UserRegistrationDto();
	}

}
