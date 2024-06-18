package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EProductBean;
import com.dao.EProductDao;

@Controller
public class EProductController {

	
	@Autowired
	EProductDao dao;
	
	
	@GetMapping("/newproduct")
	public String newProduct() {
		return "NewProduct";
	}
	
	@PostMapping("/saveproduct")
	public String saveProduct(EProductBean bean) {
		// using bean read data ->productBean

		// validation using XX

		// dao insert
		dao.addProduct(bean);
		return "Welcome";
	}
}
