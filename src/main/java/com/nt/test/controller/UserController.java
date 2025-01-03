package com.nt.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/home1")
	public String showHomePage() {
		return "UserHome";
	}
}
