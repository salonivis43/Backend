package com.ranjeet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DemoRequestDispactcher")
public class servletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("username","Saloni");
		//Methods available to HttpSession Object
		//long getCreation Time() : returns the unix timestamp time session was created
		//String getId() : unique identifier for the session object
		//long getLastAccessedTime(): the last time client sent the request with associated session id.
		//void invalidate()://destroy session 
		
		System.out.print("Instantiated HttpSession Object !!");
		//System.out.print("getCreation Time() : "+ session.getCreationTime());
		System.out.print("getId() : "+session.getId());
		//System.out.print("long getLastAccessedTime():"+session.getLastAccessedTime());
		//session.invalidate();
		//int getMaxInactivegetMaxInactiveTime():returns the maximun time interval in seconds
		//System.out.println("isNew() : "+session.isNew());
		System.out.println("getMaxInactiveTime() : "+session.getMaxInactiveInterval());
}


}