package com.webosmotic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webosmotic.modal.User;
import com.webosmotic.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUsers() {
		System.out.println("Getting all users" + userService.getUser());
		return userService.getUser();
	}
	
}
