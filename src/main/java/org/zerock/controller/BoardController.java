package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	private BoardService service;
	
	@GetMapping("/getList")
	public void getList(Model model) {
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/get")
	public void get(Model model) {
		model.addAttribute("list", service.get());
	}
}
