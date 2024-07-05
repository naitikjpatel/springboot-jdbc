<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3>Welcome to login page</h3>
<form action="elogin" method="post">
	<input type="email" name="email" placeholder="Enter the Email id"/><br><br>
	<input type="password" name="password" placeholder="Enter the password"/> <br/> <br/>
	<input type="submit" value="submit"/>
	
	
</form>

<br/>
${error }
</body>
</html>