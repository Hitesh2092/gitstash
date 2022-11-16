package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String Welcomemsg() {
	String msg="Good evening";
	return "Welcome";
	}
}
