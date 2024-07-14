package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ECartBean;

@Repository
public class CartDao {

	@Autowired
	JdbcTemplate stmt;
	public void addToCart(ECartBean bean) {
		stmt.update("insert into cart (productId,userId) values (?,?) ",bean.getProductId(),bean.getUserId());
		
	}
}
