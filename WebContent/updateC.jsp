<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Category</title>
</head>
<body>
<tags:check-login/>

	<h2>Update Category Name Here</h2>

	<form action="ControllerServlet">
		<input type="text" name="id" placeholder="enter category id"><br>
		<input type="text" name="name" placeholder="enter category name"><br>
		<input type="submit" name="buttonName" value="updateC">
	</form>
	<br /><br />
	<br>
	<br>
	<tags:footer-category/>
</body>
</html>