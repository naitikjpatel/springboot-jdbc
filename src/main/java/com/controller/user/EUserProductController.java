package com.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/userviewimage")
	public String userViewImage(@RequestParam("productId") Integer productId,Model model) {
		System.out.println(productId);
		EProductBean product= dao.getProductById(productId);
		System.out.println(product);
		model.addAttribute("product",product);
		return "UserViewProduct";
		
	}
}
