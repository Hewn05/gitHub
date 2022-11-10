package com.study.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.dao.IbasicBbsDao;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	private Logger log1 = LoggerFactory.getLogger(getClass());
	
	@Autowired	
	IbasicBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		log1.info("info logger1");
		log.info("lombok logger2");
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String userlist(Model model) {
		model.addAttribute("list",dao.listDao());
		
		int total = dao.postCount();
		System.out.println("total count : " + total);
		
		return "list";
	}
	
	@RequestMapping("/write")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/writing")
	public String write(HttpServletRequest req, Model model) {
		Map<String, String> map = new HashMap<>();
		String wri = req.getParameter("writer");
		String tit = req.getParameter("title");
		String con = req.getParameter("content");
		map.put("writer", wri);
		map.put("title", tit);
		map.put("content", con);
		int res = dao.writeDao(map);
		System.out.println("write : " + res );
		return "redirect:list";
	}
	
	@RequestMapping("/view")
	public String detailView(HttpServletRequest req, Model model) {		
		String uId = req.getParameter("id");
		model.addAttribute("dto",dao.viewDao(uId));		
		return "view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest req, Model model) {
		int res = dao.deleteDao(req.getParameter("id"));
		System.out.println("delete : " + res);
		return "redirect:list";
	}
		
}
