<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>

	<form action="ControllerServlet">

		<input type="text" placeholder="enter user name" name="username">
		<br> 
		<input type="password" placeholder="enter password" name="password"> 
		<br> 
		
		<input type="submit" name = "buttonName" value="sign in">

	</form>
</body>
</html>