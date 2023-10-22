package com.bdWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbWork {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","");
		if(con!=null) {
			System.out.println("Database connected successfully ");
			String sql = "select * from employee";
			Statement stmt = con.createStatement();
			ResultSet sr = stmt.executeQuery(sql);
			
			while(sr.next()) {
				System.out.println(sr.getInt(1)+"\t   "+sr.getString(2)+"\t   "+sr.getString(3)+"\t   "+sr.getInt(4)+"\t   "+sr.getInt(5));
//				con.close();
				}
		}
		else {
			System.out.println("Database is not created");
		}
	}

}
