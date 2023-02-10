package com.maju.k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	
	@GetMapping("index.do")
	String index() {
		System.out.println("=====> index.do");
		return "index.html";
	}
	
}
