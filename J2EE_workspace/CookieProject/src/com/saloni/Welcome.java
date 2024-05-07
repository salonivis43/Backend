package com.saloni;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
    	Cookie[] cks= request.getCookies();
    	//out.println("Welcome"+cks[0].getValue());
    	out.println("Cookie Name :"+cks[0].getName()+"<br/>"+"Cookie Value :"+cks[0].getValue());
    	out.println("Cookie Default Age :"+cks[0].getMaxAge());
    }

}
