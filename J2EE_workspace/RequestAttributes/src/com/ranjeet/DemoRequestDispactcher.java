package com.ranjeet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoRequestDispactcher")
public class DemoRequestDispactcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("Hey I am DemoRequestDispectcher Servlet");
		
		/equest.setAttribute("myname","DemoRequestDispactcher");
		
		request.setAttribute("firstname","Saloni");
		
		request.setAttribute("lastname","Vishwakarma");
         
		RequestDispatcher rd = request.getRequestDispatcher("TargetServlet");
		
		rd.forward(request, response);
	}

}