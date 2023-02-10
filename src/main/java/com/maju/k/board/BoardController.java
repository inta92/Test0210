package com.maju.k.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	
	
	@GetMapping("insert.do")
	String insert() {
		
		return null;
	}
	
	
	@GetMapping("getSelectAll.do")
	String getSelectAll() {
		
		return null;
	}
}
