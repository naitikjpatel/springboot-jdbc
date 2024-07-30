package com.bean;

public class ProductCartBean {

	
	private String productName;
	private String category;
	private Float price;
	private String imgSrcPic;

	private Integer cartId;
	private Integer userId;
	private Integer productId;
	private Integer qty;
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
	
	public String getImgSrcPic() {
		return imgSrcPic;
	}
	public void setImgSrcPic(String imgSrcPic) {
		this.imgSrcPic = imgSrcPic;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	
	
	
	
}
