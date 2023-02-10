package com.maju.k.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamController {
	
	@Autowired
	ExamServiceIpml service;
	
	@GetMapping("/exam/examInsertOK.do")
	String examInsertOK(ExamVO vo) {
		System.out.println("===> examInsertOK.do");
		service.insert(vo);
		return "redirect:/exam/examSelectAll.do";
	}
	
	@GetMapping("/exam/examInsert.do")
	String examInsert(ExamVO vo) {
		System.out.println("===> examInsert.do");
		return "/exam/examInsert.html";
	}
	
	@GetMapping("/exam/examEdit.do")
	String examEdit(Model model) {
		System.out.println("===> examEdit.do");
		model.addAttribute("m", service.examSelectAll());
		return "/exam/examEdit.html";
	}
	
	@GetMapping("/exam/examSelectAll.do")
	public String examSelectAll(Model model) {
		System.out.println("=====> examSelectAll.do");
		model.addAttribute("li", service.examSelectAll());
		return "/exam/examSelectAll.html";
	}
}
