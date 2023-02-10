package com.maju.k.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping("/")
	public  String index() {
		
		System.out.println("index.html 요청합니다.");
		
		return "redirect:index.html";		
	}
	
	@GetMapping("/admin")
	public  String admin() {		
		System.out.println("admin 요청합니다.");		
		return "/admin/index.html";		
	}
	
	@GetMapping("/manager")
	public  String manager() {		
		System.out.println("manager 요청합니다.");		
		return "/manager/index.html";		
	}
	
	@GetMapping("/member/board")
	public  String board() {		
		System.out.println("board 요청합니다.");		
		return "/board/index.html";		
	}
	
	@GetMapping("/member/exam")
	public  String exam() {		
		System.out.println("exam 요청합니다.");		
		return "/exam/index.html";		
	}
	
	
}
