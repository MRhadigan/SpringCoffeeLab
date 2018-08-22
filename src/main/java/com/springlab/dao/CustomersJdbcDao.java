package com.springlab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springlab.entity.Customers;

	@Repository
	public class CustomersJdbcDao {
	
		
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		public List<Customers> findAll(){
			return jdbcTemplate.query("select * from customers", new BeanPropertyRowMapper<Customers>(Customers.class));
		}
		
		public int insertCustomer(String id, String compName, String contName, String contTitle, String phone) {
			String insertQuery = "INSERT INTO customers(companyName, ContactTitle, ContactName, CustomerID, phone)"
					+ " values(?,?,?,?,?)";
			return jdbcTemplate.update(insertQuery, compName, contTitle, contName, id, phone);
			
		}
		
		public int updateCustomer(String id, String contName) {
			
			String updateQuery = "UPDATE customers set contactName=? where customerID = ?";
			return jdbcTemplate.update(updateQuery, contName, id);
			
		}
		
		public int deleteCustomer(String id) {
	        String deleteQuery = "delete from customers where customerID = ?";
	        return jdbcTemplate.update(deleteQuery, id);
	    }
		
	}
	

