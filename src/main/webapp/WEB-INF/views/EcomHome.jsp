<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcom , ${user.firstName} to Home page</h2><br/>
<img alt="" src="${user.profilePicPath}" height="200px" width="200px">

<br/>
<a href="products">Go to List Product</a>
</body>
</html>