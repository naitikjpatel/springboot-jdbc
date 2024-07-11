<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>


<div class="container-fluid">
	
<h3>Welcome to login page</h3>

<form action="elogin" method="post">
	<input type="email" name="email" placeholder="Enter the Email id"/><br><br>
	<input type="password" name="password" placeholder="Enter the password"/> <br/> <br/>
	<input type="submit" value="submit"/>
	
	
</form>
</div>

<br/>
${error }
</body>
</html>