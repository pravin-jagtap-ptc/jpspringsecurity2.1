package com.spring.security.SecurityApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String loginPage() {
		System.out.println("login page");
		return "login page";
	}
	
	@GetMapping("/user")
	public String homePage() {
		System.out.println("User home page");
		return "User home page";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		System.out.println("Admin home page");
		return "Admin home page";
	}
}
