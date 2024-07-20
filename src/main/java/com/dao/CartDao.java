package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ECartBean;
import com.bean.EProductBean;

@Repository
public class CartDao {

	@Autowired
	JdbcTemplate stmt;
	public void addToCart(ECartBean bean) {
		stmt.update("insert into cart (productId,userId) values (?,?) ",bean.getProductId(),bean.getUserId());
		
	}
	
	public List<EProductBean> mycart(Integer userId){
		//select * from products join cart using (productId) where userId= 1;
		List<EProductBean> products= stmt.query("select * from products join cart using (productid) where userId =?",new BeanPropertyRowMapper<>(EProductBean.class),new Object[] {userId});
		return products;
	}
	
	public void removeItemFromCart(Integer productId,Integer userId) {
	
		stmt.update("delete from cart where productId=? and userId=?",new Object[] {productId,userId});
	}
}
