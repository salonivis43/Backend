package com.saloni;

//SERVLET LIFE CYCLE
//constructor
//init()
//service()
//doXxx()
//destroy()
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLifeCycle() {
        super();
        System.out.print("Contructor() => Called!");
    }
                                          
    
    //what does container passes in config object to init method of servlet
    //Should be override init() method if yes then when
    //Name the method which is called by init()
    //Which SLC method calls the init() method.
    
    public void Init(ServletConfig config) {
    	System.out.print("Init() => Called!");
    	
    }
    
    public void Service() {
    	System.out.print("Service Called!");
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("doGet()=> Called");
//		response.getWriter().println("doGet()=> Called!");
	}



}
