<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>
</head>
<body>
	<%
	String city = (String) request.getAttribute("city");
	%>
	<h1>Welcome to about page</h1>
	<h1>
		Here is a hi! from about page city
		<%= city%></h1>
</body>
</html>