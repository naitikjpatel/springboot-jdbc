package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.EmailService;

public class PaymentController {

	
	@Autowired
	EmailService emailService;
	
	
	@GetMapping("/checkout")
	public String checkOut() {
		return "checkout";
	}

	
	@GetMapping("/inputemail")
	public String inputEmail() {
		return "InputEmail";
	}
	
	@PostMapping("/sendemail")
	public String sendMail(@RequestParam("email") String email) {
//		here we can bean to get the data from which is provided by the form but form from we get only one data so here we are not creating a bean class we just get the data using the @RequestParam() 
		
		System.out.println(email);
		emailService.sendDemoMail(email, "How Are U?");
		
		return "Success";
	}
}
