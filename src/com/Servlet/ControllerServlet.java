package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonName = request.getParameter("buttonName");
		switch (buttonName) {
		case "sign in":
			RequestDispatcher rd1 = request.getRequestDispatcher("SignInServlet");
			rd1.forward(request, response);
			break;
			
         case "addC":
			RequestDispatcher rd2 = request.getRequestDispatcher("addCServlet");
			rd2.forward(request, response);
			break;	
		
         case "updateC":
 			RequestDispatcher rd3 = request.getRequestDispatcher("updateCServlet");
 			rd3.forward(request, response);
 			break;
 		
         case "deleteC":
  			RequestDispatcher rd4 = request.getRequestDispatcher("deleteCServlet");
  			rd4.forward(request, response);
  			break;
  		
         case "searchC":
   			RequestDispatcher rd5 = request.getRequestDispatcher("searchCServlet");
   			rd5.forward(request, response);
   			break;
   		
         case "logout":
 			RequestDispatcher rd6 = request.getRequestDispatcher("LogoutServlet");
 			rd6.forward(request, response);
 			break;
 			
         case "addP":
 			RequestDispatcher rd7 = request.getRequestDispatcher("addPServlet");
 			rd7.forward(request, response);
 			break;
 			
         case "updateP":
  			RequestDispatcher rd8 = request.getRequestDispatcher("updatePServlet");
  			rd8.forward(request, response);
  			break;
  			
         case "deleteP":
   			RequestDispatcher rd9 = request.getRequestDispatcher("deletePServlet");
   			rd9.forward(request, response);
   			break;
   		
         case "searchP":
    			RequestDispatcher rd10 = request.getRequestDispatcher("searchPServlet");
    			rd10.forward(request, response);
    			break;
			
		default:
			break;
		
		}
	}

}
