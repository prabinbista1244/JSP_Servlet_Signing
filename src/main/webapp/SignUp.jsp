<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
	<form action="UserSignUpServlet" method = "post">
		Name:<input type = "text" name = "name" ><br><br>
		Email:<input type = "text" name = "email" ><br><Br>
		Phone:<input type = "number" name = "phone"><br><br>
		Password:<input type = "text" name = "password" ><Br><Br>
		<input type = "submit" value = "SignUp">
	</form>
</body>
</html>