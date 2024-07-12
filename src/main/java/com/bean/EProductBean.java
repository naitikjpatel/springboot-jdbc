package com.bean;

import org.springframework.web.multipart.MultipartFile;

public class EProductBean {

	private Integer productId;
	private String productName; 
	private String category;
	private Float price;
	private Integer qty;
	MultipartFile imgSrc;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public MultipartFile getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(MultipartFile imgSrc) {
		this.imgSrc = imgSrc;
	}
	
	
		
}
