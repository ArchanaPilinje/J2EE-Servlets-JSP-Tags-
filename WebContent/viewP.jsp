<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@page import="com.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.impl.ProductDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Products</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}
table {
	border-collapse: collapse;
	width: 30%;
}
th, td {
	text-align: left;
	padding: 8px;
}
tr:nth-child(even) {
	background-color: gainsboro;
}
</style>
</head>
<body>
<%
	if(request.getSession(false).getAttribute("loginStatus") == null)
		response.sendRedirect("http://localhost:8080/AdminJSP/login.jsp");
%>
	<%
		ProductDAOImpl impl = new ProductDAOImpl();
		ArrayList<Product> list = impl.showAllProducts();
	%>
	<input type="hidden" name="o" value="12">
	<table>
		<tr>
			<th>PRODUCT ID</th>
			<th>CATEGORY ID</th>
			<th>PRODUCT NAME</th>
			<th>COST PRICE</th>
			<th>SALE PRICE</th>
			<th>CATEGORY DESCRIPTION</th>
			<th></th>
		</tr>
		
		<% 
			for (Product prod : list) {
		%>
		<tr>
			<td><%=prod.getProductID()%></td>
			<td><%=prod.getCategoryID()%></td>
			<td><%=prod.getProductName()%></td>
			<td><%=prod.getCostPrice()%></td>
			<td><%=prod.getSalePrice()%></td>
			<td><%=prod.getProductdescription()%></td>
		</tr>
		<%
			}
		%>
		
		</table>
		
		<br /><br />
		<h1>Printing using P tags</h1>
		<tags:print-products/>
	<br>
	<br>
	<tags:footer-products/>
</body>
</html>