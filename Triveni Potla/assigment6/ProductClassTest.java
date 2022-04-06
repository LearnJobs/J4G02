package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductClassTest {
	static String Driver = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	   static final String USER = "system";
	   static final String PASS = "manager";
	   static final String QUERY = "Select * from Product";

	   public static void main(String[] args) throws ClassNotFoundException {
	      // Open a connection
	      try {
	    	 Class.forName(Driver); 
	         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY);
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs.getInt("product_id"));
	            System.out.print(", Age: " + rs.getString("product_name"));
	            System.out.print(", First: " + rs.getInt("product_price"));
	            System.out.println(", Last: " + rs.getString("PRODUCT_CATAGORY"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }

}
