package com.nagarro.signupsignindetails.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nagarro.signupsignindetails.dto.UserRegistrationDto;
import com.nagarro.signupsignindetails.model.User;

public interface UserService extends UserDetailsService{
	
	User Save(UserRegistrationDto registrationDto);
	

}
