package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		boolean status;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("admin") && password.equals("admin1234")) {
			status = true;
		} else {
			status = false;
		}
		
		Cookie[] cookies = request.getCookies();

		for (Cookie c : cookies) {
			System.out.println(c.getName() + "," + c.getValue());
		}
		
		if (status) {
			HttpSession session = request.getSession();
			session.setAttribute("loginStatus", true);
			response.addCookie(new Cookie("loginBy" + request.getParameter("username"), request.getParameter("username")));
			System.out.println("Cookie added !");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {
			response.getWriter().print("<h1>Login Credentials Invalid ! </h1>");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		
	}

}
