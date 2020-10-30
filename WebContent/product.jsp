<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<tags:check-login/>
<h1>Welcome to Products</h1>

	<a href="addP.jsp">Add Product</a>
	<br>
	<a href="updateP.jsp">Update Product</a>
	<br>
	<a href="deleteP.jsp">Delete Product</a>
	<br>
	<a href="viewP.jsp">View all Products</a>
	<br>
	<a href="searchP.jsp">Search a Product</a>
</body>
</html>