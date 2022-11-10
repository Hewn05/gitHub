package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValController {

	@RequestMapping("/")
	public String root() {
		return "insertForm";
	}
	
	@RequestMapping("/done")
	public String insert(@ModelAttribute("dto") @Valid ContentDTO contentDTO,
						 BindingResult result) {
		String page = "donePage";
		System.out.println(contentDTO);
		
		if(result.hasErrors()) {
			System.out.println("getAllErrors : " + result.getAllErrors());
			if(result.getFieldError("writer")!=null) {
				System.out.println("error1 : "+result.getFieldError("writer").getDefaultMessage());
			}
			if(result.getFieldError("content")!=null) {
				System.out.println("error1 : "+result.getFieldError("content").getDefaultMessage());
			}
			page = "insertForm";
		}
		return page;
		
	}
}
