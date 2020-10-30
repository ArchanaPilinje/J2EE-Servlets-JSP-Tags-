<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>
</head>
<body>
<tags:check-login/>

	<h2>Add Products Here</h2>

	<form action="ControllerServlet">
		<input type="text" name="pid" placeholder="enter product id"><br>
		<input type="text" name="cid" placeholder="enter category id"><br>
		<input type="text" name="name" placeholder="enter product name"><br>
		<input type="text" name="cp" placeholder="enter sale price"><br>
		<input type="text" name="sp" placeholder="enter cost price"><br>
		<input type="text" name="description" placeholder="enter product description"><br>
		
		<input type="submit" name="buttonName" value="addP">
	</form>
	<br /><br />
	<br>
	<br>
	<tags:footer-products/>
</body>
</html>