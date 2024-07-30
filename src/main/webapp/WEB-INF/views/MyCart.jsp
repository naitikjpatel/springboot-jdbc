<%@page import="com.bean.ProductCartBean"%>
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
	<h2>MyCart</h2>




	<%
	List<ProductCartBean> products = (List<ProductCartBean>) request.getAttribute("products");
	Float price = 0.0f;
	%>

	<table border="1">
		<tr>
		<th>CarId</th>
			
			<th>ProductName</th>
			<th>Image</th>
			<th>Price</th>
			<th>Qty</th>
			<th>TotalPrice</th>
			<th>Action</th>
			<th>Add Qty</th>
			
		</tr>
		<%
		for (ProductCartBean p : products) {
			out.print("<tr>");
			out.print("<td>" + p.getProductId() + "</td><td>" + p.getProductName() + "</td>");
			//out.print("<td><img height='100px' width='100px' src='"+p.getImgSrcPic()+"'/></td>");
			out.print("<td><img height='100px' width='100px' src='"+p.getImgSrcPic()+"'/></td>");
			out.print("<td>"+p.getPrice()+"</td>");
			out.print("<td>" + p.getQty() + "</td>");
			out.print("<td>" + p.getQty()*p.getPrice() + "</td>");
			out.print("<td><a href='removecartitem?productId="+p.getProductId()+"&cartId="+p.getCartId()+"'>Remove</a></td>");
			//out.print("<td><a href='addOneToQty?cartId="+p.getCartId()+"<td>");
			out.print("<td ><a href='addOneToQty?cartId="+p.getCartId()+"&productId="+p.getProductId()+"&qty="+p.getQty()+"'>+</a></td>");
			out.print("</tr>");
			price = price + (p.getPrice()*p.getQty());
		}
		%>
		


	</table>

		<Br> 

		Total Price <%=price %>

	 	<br><Br>
	 	<a href="checkout">Checkout</a>
</body>
</html>