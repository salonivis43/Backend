package com.saloni;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/result")
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int roll=Integer.parseInt(request.getParameter("roll"));
		String result=null;
		switch(roll){
			case 101:
				result="<b style='color:green'>congrats Saloni ! <br> you are passed ||</b>";
				break;
			case 102:
				result="<b style='color:green'>congrats Ranjeet ! <br> you are passed||</b>";
				break;
			case 103:
				result="<b style='color:red'>Sorry aakash ! <br> better Luck Next Time||</b>";
				break; 
				default:
					result="<b style='color:red'>Invalid Roll !!</b>";
			
			
		
		
		}
		
		response.getWriter().print(result);

	}

}
