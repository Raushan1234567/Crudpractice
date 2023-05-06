package com.masai.dao;

import java.sql.*;
import java.util.ResourceBundle;

public class Connection1 {
    static String url,user,pass;
    
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			ResourceBundle r=ResourceBundle.getBundle("rau");
			url=r.getString("url");
			user=r.getString("user");
			pass=r.getString("password");
			
		} catch (ClassNotFoundException e) {
		
			System.out.println(e.getMessage());
		}
	}
	
	static Connection getco() throws SQLException { 
		return DriverManager.getConnection(url,user,pass);
	}
	
	static void closeco(Connection c) throws SQLException {
		if(c!=null)
		{
			c.close();
		}
		
	}
}
