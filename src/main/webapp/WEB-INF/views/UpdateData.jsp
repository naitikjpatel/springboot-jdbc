<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ProductId is : ${productId}</h1>
<h1>ProductName is : ${productName}</h1>
<h1>ProductCategory is : ${category }</h1>
<h1>Product Qty is : ${qty}</h1>
<h1>Product Price is : ${price }</h1>

<h2>Chnage the Product Details</h2>
<form action="saveUpdatedData" method="post">
	
	<input type="hidden" name="productId" value="${productId }"/>
	<input type="text" placeholder="Enter the ProductName" name="productName" value="${productName}"  /> <br/><br/>
	<input type="text" placeholder="Enter the Category" name="category" value="${category }"/><br/><br/>
	<input type="text" placeholder="Enter the Qty" name="qty" value="${qty }" /><br/><br/>
	<input type="text" placeholder="Enter the Price of the Product" name="price" value="${price}" /><br/><br/>
	<input type="submit" value="SUBMIT" /> 
</form>
</body>
</html>