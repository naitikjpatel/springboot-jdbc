package com.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bean.EProductBean;
import com.dao.EProductDao;

@Controller
public class EUserProductController {

	@Autowired
	EProductDao dao;
	
	@GetMapping("/userproducts")
	public String listProducts(Model model) {
		
		//call method : getAllProducts
		List<EProductBean> products=dao.getAllProducts();
		model.addAttribute("products",products);
		
		return "EUserListProducts";
	}
	
}
