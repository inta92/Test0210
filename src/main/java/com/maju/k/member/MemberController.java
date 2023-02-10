package com.maju.k.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl service;
	
	@GetMapping("/member/memberList.do")
	String memberList(Model model) {
		
		model.addAttribute("li", service.memberList());
				
		return "/member/selectAll.html";
	}
	
	@GetMapping("/member/login.do")
	String login() {
		System.out.println("===>login.do");
				
		return "/member/login.html";
	}
	
	
}
