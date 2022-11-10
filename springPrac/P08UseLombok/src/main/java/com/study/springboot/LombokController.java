package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LombokController {


	@RequestMapping("/")
	public String root() {
		return "form";
	}
	
	@RequestMapping("/test")
	public String test3(PersonDTO person, Model model) {
			
		model.addAttribute("person", person);
		return "test";
		
	}
	
}
