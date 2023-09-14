package com.demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Adminstration {
	
	
	@RequestMapping("/start")
	public String getdata() {
		return "index";
	}
	
	

}
