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


@WebServlet("/addPServlet")
public class addPServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		int cid=Integer.parseInt(request.getParameter("cid"));
		String name=request.getParameter("name");
		int cp=Integer.parseInt(request.getParameter("cp"));
		int sp=Integer.parseInt(request.getParameter("sp"));
		String desc=request.getParameter("description");
		ProductDAOImpl impl=new ProductDAOImpl();
		Product p=new Product();
		p.setProductID(pid);
		p.setCategoryID(cid);
		p.setProductName(name);
		p.setCostPrice(cp);
		p.setSalePrice(sp);
		p.setProductdescription(desc);
		int res=impl.save(p);
		request.getRequestDispatcher("addP.jsp").include(request, response);
		out.println("Rows inserted=" + res);
	}

}
