package com.salonivis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;




public class config extends GenericServlet {
	
	public int count;
	 
	public void init(ServletConfig sc) {
		
		count=Integer.parseInt(sc.getInitParameter("count"));
		
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		out.println("value of count : "+count);
	}

}
