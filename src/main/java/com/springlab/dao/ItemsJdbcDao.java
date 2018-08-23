package com.springlab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.springlab.entity.Items;

@Repository
public class ItemsJdbcDao {


	
		
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		public List<Items> findAll2(){
			return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
		}
		
		public int insertItems(String itemID, String Name, String description, String quantity, String price) {
			String insertQuery = "INSERT INTO items(itemID, Name, description, quantity, price)"
					+ " values(?,?,?,?,?)";
			return jdbcTemplate.update(insertQuery, itemID, Name, description, quantity, price);
			
		}
		
		public int updateItems(String itemID, String Name) {
			
			String updateQuery = "UPDATE items set Name=? where itemID = ?";
			return jdbcTemplate.update(updateQuery, Name, itemID);
			
		}
		
		public int deleteItems(String itemID) {
	        String deleteQuery = "delete from items where itemID = ?";
	        return jdbcTemplate.update(deleteQuery, itemID);
	    }
}
	
