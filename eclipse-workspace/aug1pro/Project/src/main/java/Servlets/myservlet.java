package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		System.out.println("this is a get method .........");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>This get method of Servlet</h1>");
		
	}

}
