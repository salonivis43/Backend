package com.saloni;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServletConfig extends GenericServlet {
	
	public int count;
	
	public void Init(ServletConfig sc) {

			count = Integer.parseInt(sc.getInitParameter("count"));
    	
    }
@Override
public void service(ServletRequest arg0 , ServletResponse arg1) throws ServletException,IOException {
    	PrintWriter out=arg1.getWriter();
    	arg1.setContentType("text/html");
    	out.println("value of count : "+count);
    	
    }

}