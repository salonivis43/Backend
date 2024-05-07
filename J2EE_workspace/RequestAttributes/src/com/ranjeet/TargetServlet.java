package com.ranjeet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TargetServlet
 */
@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().println("<b>Welcome to Target Servlet<b> <br/>");
		
		//String mname = (String) request.getAttribute("myname");
		
		String fname = (String) request.getAttribute("firstname");
		
		String lname = (String) request.getAttribute("lastname");
		
		//response.getWriter().println(mname);
		
		response.getWriter().println(fname);
		
		response.getWriter().println(lname);
	}

}