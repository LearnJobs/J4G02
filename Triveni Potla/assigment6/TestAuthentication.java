package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAuthentication {
	static String Driver = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "system";
	static final String PASS = "manager";
	static final String QUERY = "Select username,password from Register";
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 
		check("Triveni","Triveni123");
		
	}
	public static void check(String userName,String passWord) throws SQLException, ClassNotFoundException {
		Class.forName(Driver); 
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        boolean flag=false;
        while (rs.next()) {
	            if(rs.getString("userName").equals(userName) || rs.getString("password").equals(passWord)) {
	            	flag=true;
	            	break;
	            }
	      }
        if(flag) {
        	System.out.println("UserName And Password Is present in table");
        }else {
        	System.out.println("UserName And Password Is not present in table");
        }
		System.out.println(userName+"......"+passWord);
	}
	
}
