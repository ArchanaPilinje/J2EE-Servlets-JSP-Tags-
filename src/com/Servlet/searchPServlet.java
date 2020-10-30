package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.impl.ProductDAOImpl;

import com.model.Product;


@WebServlet("/searchPServlet")
public class searchPServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		ProductDAOImpl impl=new ProductDAOImpl();
		Product p=new Product();
		p=impl.showProductByID(id);
		request.getRequestDispatcher("searchP.jsp").include(request, response);
		out.println("Product found=" +p);
	}

}
