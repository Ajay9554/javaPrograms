package com.servletLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registers")
public class registers extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String myName = req.getParameter("name");
		String myEmail = req.getParameter("email");
		String myPass = req.getParameter("password");
		String myContact = req.getParameter("contact");
		String myCity = req.getParameter("city");

		try {
			 
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindemo","root","Ajaykumar@123");
				
				if(conn!=null) {
					System.out.println("Connection build");
				}else {
					System.out.println("Connection not build");
				}
				
			
			PreparedStatement pstm = conn.prepareStatement(
					"insert into register(`name`,`email`,`password`,`gender`,`city`) values(?,?,?,?,?)");
			pstm.setString(1, myName);
			pstm.setString(2, myEmail);
			pstm.setString(3, myPass);
			pstm.setString(4, myContact);
            pstm.setString(5, myCity);
			if (pstm.executeUpdate() == 1) {
				out.println("<h1> Successfull</h1>");
			} else {
				out.println("<h2>Error</h2>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
