package test.code;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")


public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Reading Request parameter
		
		String name=request.getParameter("name");
		String collage=request.getParameter("collage");
		
		response.getWriter().println("<i style='color:blue'>Hello From :</i> "+name+"<br><i style='color:blue'>Collage : </i>"+collage);
	}

}
