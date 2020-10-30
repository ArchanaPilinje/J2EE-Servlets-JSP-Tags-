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


@WebServlet("/addCServlet")
public class addCServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String desc=request.getParameter("description");
		CategoryDAOImpl c=new CategoryDAOImpl();
		Category c1=new Category();
		c1.setCategoryId(id);
		c1.setCategoryName(name);
		c1.setDescription(desc);
		int res=c.save(c1);
		request.getRequestDispatcher("addC.jsp").include(request, response);
		out.println("Rows inserted=" + res);
	}

}
