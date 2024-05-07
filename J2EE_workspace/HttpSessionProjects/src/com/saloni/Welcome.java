package com.saloni;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	
    	PrintWriter out=response.getWriter();
    	HttpSession session=request.getSession();
    	//System.out.println(session.getMaxInactiveInterval());
    	String user=(String)session.getAttribute("user");
    	
    	if(user==null) {
    		out.println("  Unauthorized   Access!  ");
    	}
    	else {
    		out.println("  Hello   "+user);
	}
    }

}
