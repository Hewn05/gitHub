package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.service.BuyTicketService;

@Controller
public class MainController {
	
	@Autowired
	BuyTicketService buyTicket;
	
	@RequestMapping("/")
	public String root() {
		return "/buy_ticket";
	}
	
	@RequestMapping("/buy_ticket")
	public String buy_ticket() {
		return "buy_ticket";
	}
	
	@RequestMapping("/buy_ticket_card")
	public String buy_ticket_card(@RequestParam("consumerId") String consumerId,
								@RequestParam("amount") String amount, 
								@RequestParam("error") String error,
								Model model) {
		int res = buyTicket.buy(consumerId, Integer.parseInt(amount), error);
		System.out.println(res);
		model.addAttribute("consumerId",consumerId);
		if(res==1) {
			return "buy_ticket_end";
		}else {
			return "buy_ticket_error";
		}
	}
	

}
