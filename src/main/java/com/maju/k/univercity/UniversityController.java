package com.maju.k.univercity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UniversityController {
	
	@Autowired
	UniversityServiceImpl service;
	
	@GetMapping("/uni/select.do")
	String select(Model model) {
		System.out.println("===>select.do");
		model.addAttribute("li", service.select());
		return "/university/universitySelect.html";
	}
	
	@GetMapping("/uni/edit.do")
	String edit(Model model, UniversityVO vo) {
		System.out.println("===>edit.do");
		model.addAttribute("m", service.edit(vo));
		return "/university/universityEdit.html";
	}
	
	@GetMapping("/uni/updateOK.do")
	String updateOK(Model model) {
		System.out.println("===>updateOK.do");
		model.addAttribute("li", service.select());
		return "/university/universitySelect.html";
	}
	
}
