package com.dev.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class RestGreetings {

	@GetMapping(value="/hello")
	public String Greetings(){
		return "Welcome Back";
	}
}
