package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@GetMapping("/products")
	public String listProducts(Model model) {
		
		//call method : getAllProducts
		List<EProductBean> products=dao.getAllProducts();
		model.addAttribute("products",products);
		return "EcomListProducts";
	}
}
