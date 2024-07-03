package com.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bean.EUserBean;
import com.dao.EUserDao;
import com.service.FileUploadService;

@Controller
public class EcomSessionController {

	@Autowired
	EUserDao userDao;
	
	@Autowired 
	FileUploadService service;
	
	@GetMapping("/esignup")
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
}
