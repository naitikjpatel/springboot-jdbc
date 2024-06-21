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
	
	public List<EProductBean> getAllProducts() {
																//BeanPropertyRowMapper e nava bean banavi jashe for every row mate
		List<EProductBean> list= stmt.query("select * from products", new BeanPropertyRowMapper<EProductBean>(EProductBean.class));
		return list;
	}
	
	public void deleteProduct(Integer productId) {
		stmt.update("delete from products where productId = ?",productId);
	}
}