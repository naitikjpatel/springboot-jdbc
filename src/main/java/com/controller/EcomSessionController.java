package com.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bean.EUserBean;
import com.dao.EUserDao;
import com.service.FileUploadService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EcomSessionController {

	@Autowired
	EUserDao userDao;
	
	@Autowired 
	FileUploadService service;
	
	
	@GetMapping(path = {"/","/elogin"})
	public String welcome() {
		
	return "EcomLogin";
	}
	
	
//	authentication
	
	@PostMapping("/elogin")
	public String eLogin(EUserBean userBean,Model model,HttpSession httpSession) {
		System.out.println("User Email is : "+ userBean.getEmail());
		System.out.println("User Password is "+userBean.getPassword());
		
		//a
		//b
		//select * from users where email= ? and password =?;
		EUserBean dbUser=userDao.authenticate(userBean.getEmail(), userBean.getPassword());
//		System.out.println("Name from db"+dbUser.getFirstName());
//		System.out.println("Path from db"+dbUser.getProfilePicPath());
		//let's authenticate the dbUser
		if(dbUser == null) {
			model.addAttribute("error","Invalid Credentails");
			return "EcomLogin";
		}
		else {
			httpSession.setAttribute("user", dbUser);
			System.out.println(dbUser);
			model.addAttribute("firstName",dbUser.getFirstName());
			model.addAttribute("profilePicPath",dbUser.getProfilePicPath());
			return "EcomHome";
		}
		
	}
	
	
	@GetMapping( path = {"/esignup"})
	public String signup() {
		return "EcomSignup";
	}
	
	@PostMapping("/esignup")
	public String signupPost(EUserBean userBean) {
		//jsp from ->controller
		
		//validation
		
		//getting the image
		System.out.println(userBean.getProfilePic().getOriginalFilename());
		
		//this service method is help to uploadthe image in folder
		service.uploadUserImage(userBean.getProfilePic(),userBean.getEmail());
		
		
		//now let's set the path to store in the database
		userBean.setProfilePicPath("images\\profilepic\\"+userBean.getEmail()+"\\"+userBean.getProfilePic().getOriginalFilename());
		
		//insert
		userDao.insertUser(userBean);
	
		
		return "EcomLogin";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession httpSession) {
		//here we invalidate the session
		httpSession.invalidate();
		return "redirect:/elogin";
	}
}
