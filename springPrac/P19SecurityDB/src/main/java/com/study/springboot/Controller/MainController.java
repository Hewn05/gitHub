package com.study.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	int count = 0;

	@RequestMapping("/") 
	public String root() throws Exception{
		return "redirect:/loginForm"; 
	}
	
	@RequestMapping("/guest/welcome")
	public String welcome1() {
		System.out.println("guest");
		return "/guest/welcomeGuest";
	}

	@RequestMapping("/member/welcome")
	public String welcome2() {
		System.out.println("member");
		return "/member/welcomeMember";
	}

	@RequestMapping("/admin/welcome")
	public String welcome3() {
		System.out.println("admin");
		return "/admin/welcomeAdmin";
	}
	
	@RequestMapping("loginForm")
	public String loginForm() {
		System.out.println("login" + count++);
		return "/security/loginForm";
	}
	
	@RequestMapping("loginError")
	public String loginError() {
		System.out.println("logout");
		return "/security/loginError";
	}
}
