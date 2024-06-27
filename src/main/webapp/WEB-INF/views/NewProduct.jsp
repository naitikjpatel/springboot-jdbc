<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<h2>Add New Product</h2>


<!-- When we pass the image from the form we need to change the enctype attribute value and also we should to make method="post" -->
<form action="saveproduct" method="post" enctype="multipart/form-data">
	ProductName: <input type="text" name="productName"/> <br><br>
	Category: <input type="text" name="category"/> <br><br>
	Price: <input type="text" name=price /> <br><br>
	Qty: <input type="text" name="qty"/> <br><br>
	Master Image : <input type="file" name="masterImage"/> <br/> <br/>  
	<!-- image we can get using 2 ways : 1) using the bean and 2) using RequestParam -->
	
	<input type="submit" value="Add Product"/>

</form>
</body>
</html>