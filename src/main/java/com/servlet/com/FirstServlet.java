package com.servlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login")
public class FirstServlet extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>yahoo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My first servlet");
		out.println("</body>");
		out.println("</html>");
	}
}
