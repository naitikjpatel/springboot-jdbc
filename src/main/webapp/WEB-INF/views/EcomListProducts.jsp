<%@page import="com.bean.EProductBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List Products</h2>


<%
	List<EProductBean> products=(List<EProductBean>)request.getAttribute("products");
%>
<a href="ehome">Home</a><br><br>
<h1>Add New Product : <a href="newproduct">Click</a></h1> 
<h1>Delete the product with name :  <a href="deletewithname">Click Here</a> </h1>

<table border="1">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

<%
for(EProductBean p:products){
	out.print("<tr>");
	//out.print("<td>" + p.getProductId() + "</td><td>" + p.getProductName() + "</td><td><a href='deleteproduct?productId="+p.getProductId()+"'>Delete</a> | <a href='viewproduct?productId="+p.getProductId()+"&imgSrc="+imgSrc+"'>View</a></td> <td><a href='updateproduct?productId="+p.getProductId()+"&productName="+p.getProductName()+"&category="+p.getCategory()+"&qty="+p.getQty()+"&price="+p.getPrice()+"'>Update</a>");
	out.print("<td>" + p.getProductId() + "</td><td>" + p.getProductName() + "</td><td><a href='deleteproduct?productId="+p.getProductId()+"'>Delete</a> | <a href='viewproduct?productId="+p.getProductId()+"'>View</a></td> <td><a href='updateproduct?productId="+p.getProductId()+"&productName="+p.getProductName()+"&category="+p.getCategory()+"&qty="+p.getQty()+"&price="+p.getPrice()+"'>Update</a>");
	out.print("</tr>");
}
%>

</body>
</html>