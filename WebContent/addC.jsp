<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Category</title>
</head>
<body>
<tags:check-login/>

	<h2>Add Category Here</h2>

	<form action="ControllerServlet">
		<input type="text" name="id" placeholder="enter category id"><br>
		<input type="text" name="name" placeholder="enter category name"><br>
		<input type="text" name="description" placeholder="enter category description"><br>
		
		<input type="submit" name="buttonName" value="addC">
	</form>
	
	<br /><br />
	<br>
	<br>
	<tags:footer-category/>
</body>
</html>