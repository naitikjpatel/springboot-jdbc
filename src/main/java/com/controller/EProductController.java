package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		/*
		 * In retunrn method we can return a jsp file and also we can return the url
		 * Default: defaul return value is count as a JSP file
		 * If we want to return the url then we need to write like : redirect:/urlname
		 */
		
//		return "Welcome";
		return "redirect:/products";
	}
	
	@GetMapping("/products")
	public String listProducts(Model model) {
		
		//call method : getAllProducts
		List<EProductBean> products=dao.getAllProducts();
		model.addAttribute("products",products);
		return "EcomListProducts";
	}
	
	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("productId") Integer productId) {
		System.out.println("Deleted () =>"+productId);
		dao.deleteProduct(productId);
		return "redirect:/products";
	}
}
