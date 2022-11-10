package com.study.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Model and view";
	}	
	
	@RequestMapping("test1")
	public String test(Model model) {
		model.addAttribute("name","홍길동");
		return "test1";
	}
	
	@RequestMapping("/mv")
	public ModelAndView test2() {
		
		ModelAndView mv = new ModelAndView();
		List<String> list = new ArrayList<>();
		
		list.add("나");
		list.add("너");
		list.add("우리");
		
		mv.addObject("lists",list);
		mv.addObject("ObjectTest", "테스트입니다.");
		mv.addObject("name","홍길동");
		mv.setViewName("myView");
		return mv;
	}
}
