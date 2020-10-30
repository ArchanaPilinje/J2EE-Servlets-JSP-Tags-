package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.CategoryDAOImpl;


@WebServlet("/updateCServlet")
public class updateCServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		CategoryDAOImpl c=new CategoryDAOImpl();
		int res=c.update(id, name);
		request.getRequestDispatcher("updateC.jsp").include(request, response);
		out.println("Rows updated=" + res);
	}

}
