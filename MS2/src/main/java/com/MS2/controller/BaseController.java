package com.MS2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/index")
	public String index() {
		return "This is MS-2 index page";
	}
	
}
