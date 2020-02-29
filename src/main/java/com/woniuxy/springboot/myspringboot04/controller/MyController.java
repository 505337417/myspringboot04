package com.woniuxy.springboot.myspringboot04.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/fir")
	public String dosome(Model model) {
		
		model.addAttribute("a","aaa");
		model.addAttribute("b","bbb");
		model.addAttribute("hello","<h>hello</h>");
		model.addAttribute("users",Arrays.asList("zs","ls","ww"));

		return "a";
	}
}
