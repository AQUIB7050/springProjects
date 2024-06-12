<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
</head>
<body>

	<h1>This is home page</h1>
	<h1>Called by Home controller</h1>
	<h1>url/home</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	%>

	<h2>
		Hey! my name is
		<%=name%> and id is <%=id %></h2>

	<h1>Here is the list of my friends :-</h1>
	
	



</body>
</html>