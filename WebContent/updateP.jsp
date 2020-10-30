<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Products</title>
</head>
<body>
<tags:check-login/>

	<h2>Update Product Name Here</h2>

	<form action="ControllerServlet">
		<input type="text" name="id" placeholder="enter product id"><br>
		<input type="text" name="name" placeholder="enter product name"><br>
		<input type="submit" name="buttonName" value="updateP">
	</form>
	<br /><br />
	<br>
	<br>
	<tags:footer-products/>
</body>
</html>