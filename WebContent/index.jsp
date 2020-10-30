<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the menu page</title>
</head>
<body>
<tags:check-login/>
<h1>Welcome to the Menu</h1>
<h2>Select any one of the links</h2>

	<a href="category.jsp">CRUD OPERATION ON CATEGORY</a>
	<br>
	<a href="product.jsp">CRUD OPERATION ON PRODUCTS</a>
	<br>
	<tags:print-date/>
</body>
</html>