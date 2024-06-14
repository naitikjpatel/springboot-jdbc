package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.EUserBean;

@Repository
public class EUserDao {

	//@Autowired is use for the create the object using the singleTon design pattern
	@Autowired
	JdbcTemplate stmt;
	//jdbcTemplate is nothing but execute the over sql query 
	//jdbcTemplate have 2 methods : query(),update()
	//update () : method is use for the : insert,update and delete
	//query() : method is use for the read the data from the databases
	
	public void insertUser(EUserBean userBean) {
		
		stmt.update("insert into users (firstName,email,password) values (?,?,?)",userBean.getFirstName(),userBean.getEmail(),userBean.getPassword());
		
	}
	
	
}


//Controller ->UserBean user ->dao ->insertUser(user)


//dao ->insertUser()