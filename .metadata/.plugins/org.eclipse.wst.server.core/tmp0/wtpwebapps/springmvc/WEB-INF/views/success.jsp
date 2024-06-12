<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>

	<h2>${Header }</h2>
	<p>${Desc }</p>
	<hr>

	<!-- USING @RequestParam 

	<h3>Hi ${userName }, Welcome to this page</h3>
	<h3>User with email ${userEmail } has been successfully registered</h3>
	<h3>${userPassword } seems weak, pleas try updating your password</h3> -->

	<!-- USING @ModelAttribut -->
	<h3>Hi ${user.getName() }, Welcome to this page</h3>
	<h3>User with email ${user.getEmail()} has been successfully
		registered</h3>
	<h3>${user.getPassword()}seems weak, pleas try updating your
		password</h3>

</body>
</html>