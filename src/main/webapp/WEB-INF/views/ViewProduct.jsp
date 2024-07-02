<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to viewpage</h1>

	ProductName is  : ${product.getProductName() }  <br><br> 
	Product Category is :${product.getCategory() } <br><br>
	Product Price is : ${product.getPrice() } <br><br>
	Product Qty is : ${product.getQty() } <br><br/>
	Path :${imgSrc } <br/><br/>
	Product Img is : <img src="${imgSrc}" alt="image"/>
</body>
</html>