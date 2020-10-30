package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.ProductDAOImpl;


@WebServlet("/updatePServlet")
public class updatePServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		ProductDAOImpl imp=new ProductDAOImpl();
		int res=imp.update(id, name);
		request.getRequestDispatcher("updateP.jsp").include(request, response);
		out.println("Rows updated=" + res);
	}

}
