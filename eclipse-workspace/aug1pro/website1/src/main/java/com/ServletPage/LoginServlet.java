package com.ServletPage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
 
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("name");
		String uemail = req.getParameter("email");
		String upass = req.getParameter("password");
		String umobile = req.getParameter("contact");
		
		RequestDispatcher dispatcher=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj..jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql:localhost:3306/loginform","root","Ajaykumar@123");
			PreparedStatement pstm = con.prepareStatement("insert into signup(name,email,password,contact)VALUES(?,?,?,?)");
			pstm.setString(1, uname);
			pstm.setString(2, uemail);
			pstm.setString(3, upass);
			pstm.setString(4, umobile);
			
			int rowCount = pstm.executeUpdate();
			dispatcher =req.getRequestDispatcher("signup.jsp");
			if(rowCount > 0) {
				req.setAttribute("status", "Success");
			}
			else {
				{
					req.setAttribute("status", "failed");
				}
				dispatcher.forward(req, resp);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
			 
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				 
				e.printStackTrace();
			}
		}
	}

}
