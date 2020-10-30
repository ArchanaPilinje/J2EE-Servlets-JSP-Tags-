<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Category</title>
</head>
<body>
<tags:check-login/>

	<h2>Search a  Category Here</h2>

	<form action="ControllerServlet">
		<input type="text" name="id" placeholder="enter category id"><br>
		<input type="submit" name="buttonName" value="searchC">
	</form>
	<br /><br />
	<br>
	<br>
	<tags:footer-category/>
</body>
</html>