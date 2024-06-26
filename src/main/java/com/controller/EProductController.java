package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public String saveProduct(EProductBean bean,@RequestParam("masterImage") MultipartFile masterImage) {
		// using bean read data ->productBean

		// validation using XX

		// dao insert
		dao.addProduct(bean);
		
		/*
		 * In retunrn method we can return a jsp file and also we can return the url
		 * Default: defaul return value is count as a JSP file
		 * If we want to return the url then we need to write like : redirect:/urlname
		 */
		
//		Printing the image details
		System.out.println(masterImage.getOriginalFilename());
		
		
		
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
	
	
	@GetMapping("/deletewithname")
	public String deleteWithName() {
		return "EcomDeleteWithName";
	}
	
	@PostMapping("/deleteDataName")
	public String deleteData(EProductBean bean) {
		dao.deleteByName(bean.getProductName());
		return "redirect:/products";
	}
	
	
	
	
	
	@GetMapping("/updateproduct")  //EcomListProduct thi aa url call thay che : url rewrtting thi data leshu tene jsp par moklishu
	public String updateProduct(@RequestParam("productId") Integer productId, @RequestParam("productName") String name,@RequestParam("category") String category,@RequestParam("qty") Integer qty,@RequestParam("price") Float price,Model model) {
		System.out.println(productId+" "+name+" "+category+" "+qty+" "+price);
		model.addAttribute("productId",productId);
		model.addAttribute("productName",name);
		model.addAttribute("category",category);
		model.addAttribute("qty",qty);
		model.addAttribute("price",price);
//		return "redirect:products";
		return "UpdateData";

	}
	
	
	@PostMapping("/saveUpdatedData")
	public String saveUpdatedData(EProductBean bean) {
		dao.updateProduct(bean);
		return "redirect:/products";
	}
	
	
	@GetMapping("/viewproduct")
	public String getViewProduct(@RequestParam("productId") Integer productId,Model model) {
		
		EProductBean productBean=dao.getProductById(productId);
		model.addAttribute("product",productBean);
		return "ViewProduct";
	}
	
	
}
