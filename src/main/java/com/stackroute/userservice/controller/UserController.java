package com.stackroute.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.userservice.services.UserService;

@RestController
@RequestMapping("api/v1/userservice")
public class UserController {
	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<String> helloHandler() {
		System.out.println("hi controller is called");
		return userService.hello();
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String hello() {
		return "Hi app is under development";
	}

}
