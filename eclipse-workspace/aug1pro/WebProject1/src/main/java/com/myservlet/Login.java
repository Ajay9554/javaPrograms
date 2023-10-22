package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void Login() {
    	
        
         
    }

	 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
 
        
		PrintWriter out = res.getWriter();
	
		 
		String fn = req.getParameter("fname");
		String ln = req.getParameter("lname");
		String em = req.getParameter("email");

		if (fn.equals(" ") || ln.equals(" ") || em.equals(" ")) {
			out.println("Please enter a value of all fields");

		} else {
			out.println("<b>Your details</b>");
			out.println(fn);
			out.println(ln);
			out.println(em);
		}

	
	
	
	}

	
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 
		doGet(req, res);
	}

}
