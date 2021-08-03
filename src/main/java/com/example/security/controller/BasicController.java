package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BasicController {

	@GetMapping()
	public String helloWorld() {
		return "Hello, Welcome to SSL Secure Application.";
	}
}
