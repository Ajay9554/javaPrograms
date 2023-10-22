package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcom {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindemo","root","Ajaykumar@123");
		
		if(conn!=null) {
			System.out.println("Connection build");
		}else {
			System.out.println("Connection not build");
		}
		
	}

}
