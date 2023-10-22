package com.Project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet") // Specifies the URL mapping for this servlet
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html"); // Set the content type to HTML
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>Hello Servlet</title></head><body>");
		out.println("<h1>Hello, Java Servlet</h1>");
		out.println("</body></html>");
	}
}
