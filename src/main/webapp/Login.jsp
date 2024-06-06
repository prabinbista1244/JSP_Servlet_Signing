<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action = "UserLoginServlet" method = "post">
	<input type = "text" name = "email" ><br><br>
	<input type = "text" name = "password"><br><br>
	<input type = "submit" value = "Login" >
	</form>
</body>
</html>