package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.ECartBean;
import com.bean.EUserBean;
import com.dao.CartDao;

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
}
