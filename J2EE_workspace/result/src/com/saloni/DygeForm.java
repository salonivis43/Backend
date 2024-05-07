package com.saloni;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DygeForm")
public class DygeForm extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname=request.getParameter("username");
		String upass=request.getParameter("pass");
		
		if("admin".equals(uname)&&"admin".equals(upass)) {
			out.println("Welcome To Dashboard");
		}else {
			out.println("<form action=\"DygeForm\"method=\"get\">"
					+ "<table align=\"center\">"
					+ "<tr>"
					+ "<td>Username</td>"
					+ "<td><input type=\"text\"name=\"username\"/></td>"
					+ "</tr>"
					+"<tr>"
					+ "<td>Password</td>"
					+ "<td><input type=\"password\"name=\"pass\"/></td>"
					+ "</tr>"
					+"<tr>"
					+ "<td></td>"
					+ "<td><input type=\"submit\"value=\"Login\"/></td>"
					+ "</tr>"
					+ "</table>"
					+ "</form>");
			
		}
		
		
	
	
	}

}
