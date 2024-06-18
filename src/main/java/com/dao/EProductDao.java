package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.EProductBean;
import com.bean.EUserBean;

@Repository
public class EProductDao {

	
	@Autowired
	JdbcTemplate stmt;
	
	public void addProduct(EProductBean bean) {
		stmt.update("insert into products (productName,category,qty,price) values (?,?,?,?)",bean.getProductName(),bean.getCategory(),bean.getQty(),bean.getPrice());
	}
}
