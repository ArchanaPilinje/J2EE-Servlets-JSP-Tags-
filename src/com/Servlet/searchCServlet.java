package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.CategoryDAOImpl;
import com.model.Category;


@WebServlet("/searchCServlet")
public class searchCServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		CategoryDAOImpl c=new CategoryDAOImpl();
		Category c1=new Category();
		c1=c.showCategoryByID(id);
		request.getRequestDispatcher("searchC.jsp").include(request, response);
		out.println("Category found=" + c1);
		
	}

}
