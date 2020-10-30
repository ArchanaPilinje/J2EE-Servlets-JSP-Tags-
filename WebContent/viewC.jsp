<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@page import="com.model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.impl.CategoryDAOImpl"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>All Categories</title>

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
		CategoryDAOImpl impl = new CategoryDAOImpl();
		ArrayList<Category> list = impl.showAllCategory();
	%>
	<input type="hidden" name="o" value="12">
	<table>
		<tr>
			<th>CATEGORY ID</th>
			<th>CATEGORY NAME</th>
			<th>CATEGORY DESCRIPTION</th>
			
		</tr>
		<% 
			for (Category cat : list) {
		%>
		<tr>
			<td><%=cat.getCategoryId()%></td>
			<td><%=cat.getCategoryName()%></td>
			<td><%=cat.getDescription()%></td>
			
		</tr>
		<%
			}
		%>
	</table>
	<br/>
	<h1>Printing using C tags</h1>
	<tags:print-category/>
	<br /><br />
	<br>
	<br>
	<tags:footer-category/>
</body>
</html>