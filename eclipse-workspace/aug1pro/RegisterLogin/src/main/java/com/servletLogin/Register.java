package com.servletLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class  Register extends HttpServlet {
 
    
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =resp.getWriter();
		
	   String myName =req.getParameter("name");  
		String myEmail =req.getParameter("email");
		String myPass =req.getParameter("password");
		String myGender =req.getParameter("gender");
		String myCity =req.getParameter("city");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginDemo","root","Ajaykumar@123");
			
			PreparedStatement pstm = con.prepareStatement("insert into register(`name`,`email`,`password`,`gender`,`city`) values(?,?,?,?,?)");
			pstm.setString(1, myName);
			pstm.setString(2, myEmail);
			pstm.setString(3, myPass);
			pstm.setString(4, myGender);
			pstm.setString(5, myCity);
			
			int count = pstm.executeUpdate();
			if(count==1) {
				resp.setContentType("text/html");
				out.println("<h3 style='color:green'> User register successfully </h3>");
				
//				RequestDispatcher rd =req.getRequestDispatcher("/index.jsp");
//				rd.include(req, resp);
				
			}else {
//				resp.setContentType("text/html");
//				out.print("<h3 style='color:red'> User not register due to some error </h3>");
//				RequestDispatcher rd =req.getRequestDispatcher("/index.jsp");
//				rd.include(req, resp);
				out.println("<h3 style='color:red'> User not register due to some error  </h3>");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
//			
//			resp.setContentType("text/html");
//			out.print("<h3 style='color:red>Exception Occured: "+e.getMessage()+" </h3>");
//			RequestDispatcher rd =req.getRequestDispatcher("/index.jsp");
//			rd.include(req, resp);
		}
			 
		 
	}

}
