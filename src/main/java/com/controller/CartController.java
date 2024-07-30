package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.ECartBean;
import com.bean.EProductBean;
import com.bean.EUserBean;
import com.bean.ProductCartBean;
import com.dao.CartDao;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {

//	to set the property to the cart bean we need the object of that bean
	
	@Autowired 
	CartDao cartDao;
	
	
	@GetMapping("/addtocart")
	public String addToCart(@RequestParam("productId") Integer productId,HttpSession httpSession) {
		
		// Jsp ->productID
		//UsertId ->We get from the Session
		EUserBean bean=(EUserBean)httpSession.getAttribute("user");
		System.out.println(bean);
		ECartBean eCartBean=new ECartBean();
		eCartBean.setUserId(bean.getUserId());
		eCartBean.setProductId(productId);
		cartDao.addToCart(eCartBean);
		return "redirect:/userproducts";
	}
	
	@GetMapping("/mycart")
	public String myCart(HttpSession httpSession,Model model) {
		EUserBean bean=(EUserBean)httpSession.getAttribute("user");
		Integer userid=bean.getUserId();
//		List<EProductBean> products=cartDao.mycart(userid);
		
//		In this we got the result from the two table with the join operation
		
		List<ProductCartBean> products=cartDao.mycart(userid);
		model.addAttribute("products", products);
		return "MyCart";
	}
	@GetMapping("/removecartitem")
	public String removeCartItem (@RequestParam("productId") Integer productId ,@RequestParam("cartId") Integer cartId, HttpSession session) {
		EUserBean bean=(EUserBean) session.getAttribute("user");
		Integer userId=bean.getUserId();
		System.out.println("ProductId = "+productId);
		System.out.println("UserId = "+userId);
		cartDao.removeItemFromCart(productId, userId,cartId);
		return "redirect:/mycart";
	}
	
	
	@GetMapping("/addOneToQty")
	public String addQtyToOne(@RequestParam("cartId") Integer cartId,@RequestParam("productId") Integer productId,@RequestParam("qty") Integer qty, HttpSession session) {
		EUserBean bean=(EUserBean) session.getAttribute("user");
		Integer userId=bean.getUserId();
		
		cartDao.addOneToCart(cartId,productId,userId,qty);
		return "redirect:/mycart";
	}
}
