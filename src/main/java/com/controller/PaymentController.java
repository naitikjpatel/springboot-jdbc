package com.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PaymentController {

	
	@GetMapping("/checkout")
	public String checkOut() {
		return "checkout";
	}
	
}
