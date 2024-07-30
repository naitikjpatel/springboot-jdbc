package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ECartBean;
import com.bean.EProductBean;
import com.bean.ProductCartBean;

@Repository
public class CartDao {

	@Autowired
	JdbcTemplate stmt;
	public void addToCart(ECartBean bean) {
//		Logic 1 : This logic for add product in cart table without quantity
//		stmt.update("insert into cart (productId,userId) values (?,?) ",bean.getProductId(),bean.getUserId());
		
		
//		Logic 2: this logic for the add to cart product with the quantity
		
//		we take the productId and userId
		// if product is already added then increase the qty

		// if product is not added then add in to a cart with qty 1
		

		ECartBean cart = null;

		try {
			cart = stmt.queryForObject("select * from cart where productId = ? and userId = ? ",
					new BeanPropertyRowMapper<>(ECartBean.class),
					new Object[] { bean.getProductId(), bean.getUserId() });
		} catch (Exception e) {

		}
		
		
//		if cart is null it means we not have the product entry in the database : that means we add the products with the quantity value =1
//		if cart is not null it means we have product already in the database so first we get the that product quantity and we add +1 and then after we update the product quantity for the that user
		

		if (cart == null) {
			stmt.update("insert into cart (productId,userId,qty) values (?,?,?)", bean.getProductId(),
					bean.getUserId(), 1);
		} else {
			stmt.update("update cart set qty = ? where productId =? and userId = ? ", cart.getQty() + 1,
					cart.getProductId(), cart.getUserId());
		}

	
		
		
	}
	
	public 	List<ProductCartBean> mycart(Integer userId){
		//select * from products join cart using (productId) where userId= 1;
//		List<EProductBean> products= stmt.query("select * from products join cart using (productid) where userId =?",new BeanPropertyRowMapper<>(EProductBean.class),new Object[] {userId});
		
	List<ProductCartBean> products=	stmt.query(" select c.*,p.price,p.productName,p.imgSrcPic from products p join cart c using (productId) where userId= ?",
					new BeanPropertyRowMapper<>(ProductCartBean.class), new Object[] { userId });
		return products;
	}
	
	public void removeItemFromCart(Integer productId,Integer userId,Integer cartId) {
	
		ECartBean bean=null;
		
		try {
			bean=stmt.queryForObject("select * from cart where cartId=? and userId=?",new BeanPropertyRowMapper<>(ECartBean.class), new Object[] {cartId,userId});
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if(bean.getQty()==1) {
			stmt.update("delete from cart where cartId=? and userId=?",new Object[] {cartId,userId});
			
		}
		else {
			stmt.update("update cart set qty=? where cartId =? and userId=?",new Object[] {bean.getQty()-1,bean.getCartId(),userId});
		}
		
		
		
		
		
//		stmt.update("delete from cart where productId=? and userId=?",new Object[] {productId,userId,cartId});
	}
	
	
	public void addOneToCart(Integer cartId,Integer productId,Integer userId,Integer qty) {
		
		stmt.update("update cart set qty=? where cartId =? and userId=? and productId=?",new Object[] {qty+1,cartId,userId,productId});
		
	}
	
}
