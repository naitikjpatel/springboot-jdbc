<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="esignup" method="post"  enctype="multipart/form-data" >
FirstName: <input type="text" name="firstName"/> <br/> <br/> 
Email:		<input type="text" name="email"/><br/> <br/>
Password: 	<input type="text" name="password"/><br/> <br/>
Profile Img: <input type="file" name="profilePic"> <br/> <br/>
<input type="submit" value="SUBMIT"/> 
</form>
</body>
</html>