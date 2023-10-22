package com.DB;
import java.sql.*;

/*import java.sql.Connection;
import java.sql.DriverManager;*/

public class DBconnection {
	private static Connection conn;
	public static Connection getConnection() {
		try {
			
			if(conn!=null) {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Ajaykumar@123");
				
			}
			else {
				System.out.println("Error");
			}
			
			
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		
		
		return conn;
	}

}
