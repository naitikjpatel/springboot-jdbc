package com.bean;

import org.springframework.web.multipart.MultipartFile;

public class EProductBean {

	private Integer productId;
	private String productName; 
	private String category;
	private Float price;
	private Integer qty;
	private MultipartFile productImg; 
	private String imgSrcPic;
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
	public MultipartFile getProductImg() {
		return productImg;
	}
	public void setProductImg(MultipartFile productImg) {
		this.productImg = productImg;
	}
	public String getImgSrcPic() {
		return imgSrcPic;
	}
	public void setImgSrcPic(String imgSrcPic) {
		this.imgSrcPic = imgSrcPic;
	}
	@Override
	public String toString() {
		return "EProductBean [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", qty=" + qty + ", productImg=" + productImg + ", imgSrcPic=" + imgSrcPic + "]";
	}
	
	
	
	

		
}
