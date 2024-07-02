package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.EProductBean;


@Repository
public class EProductDao {

	
	@Autowired
	JdbcTemplate stmt;
	
	public void addProduct(EProductBean bean) {
		stmt.update("insert into products (productName,category,qty,price) values (?,?,?,?)",bean.getProductName(),bean.getCategory(),bean.getQty(),bean.getPrice());
	}
	
	public void addProduct(EProductBean bean,String imgSrc) {
		stmt.update("insert into products (productName,category,qty,price,imgSrc) values (?,?,?,?,?)",bean.getProductName(),bean.getCategory(),bean.getQty(),bean.getPrice(),imgSrc);
	}
	
	public List<EProductBean> getAllProducts() {
																//BeanPropertyRowMapper e nava bean banavi jashe for every row mate
		List<EProductBean> list= stmt.query("select * from products", new BeanPropertyRowMapper<EProductBean>(EProductBean.class));
		return list;
	}
	
	public void deleteProduct(Integer productId) {
		stmt.update("delete from products where productId = ?",productId);
	}
	
	public void updateProduct(EProductBean bean) {
		System.out.println(bean.getProductName());
		System.out.println(bean.getCategory());
		System.out.println(bean.getPrice());
		System.out.println(bean.getQty());
		System.out.println(bean.getProductId());
		stmt.update("update products set productName=?,category=?,qty=?,price =?  where productId=? ",bean.getProductName(),bean.getCategory(),bean.getQty(),bean.getPrice(),bean.getProductId());
	}
	
	public void deleteByName(String productName) {
		stmt.update("delete from products where productName =?",productName);
	}
	
	public EProductBean getProductById(Integer productId) {
		EProductBean bean=stmt.queryForObject("select * from products where productId =?",new BeanPropertyRowMapper<>(EProductBean.class),new Object[] {productId});
		
		return bean;
	}
	public String getImgSrc(Integer productId) {
		String imgsrc=stmt.queryForObject("select imgsrc from products where productId=?",new Object[] {productId }, String.class);
		return imgsrc;
	}
}
