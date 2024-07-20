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



<div class="container col-5">
</div>

<div class="card container">
<h1>Welcome to viewpage</h1>
<div class="row mb-5"></div>
<div class="d-flex flex-row mb-4">
  <div class="bg-image hover-overlay" data-mdb-ripple-init data-mdb-ripple-color="light">
    <img src="${product.getImgSrcPic()}" class="img"/>
    <a href="#!">
      <div class="mask" style="background-color: rgba(251, 251, 251, 0.15)"></div>
    </a>
  </div>
  <div class="card-body">
    <h5 class="card-title"> ${product.getProductName()}</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#!" class="btn btn-primary" data-mdb-ripple-init>Add To Cart</a>
  </div>
  </div>
  <div class="row mb-3"></div>
</div>


<!-- 
<div class="card mb-3" style="max-width: 80%;">
  <div class="row g-0 flex">
    <div class="col-md-4">
      <img src="${product.getImgSrcPic()}" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title"> ${product.getProductName() }</h5>
        <p class="card-text">Price : ${product.getPrice() } </p>
           <p class="card-text">Qty: ${product.getQty() } </p>
        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
        <p class="card-text"><small class="text-body-secondary">Last updated 3 mins ago</small></p>
      </div>
    </div>
  </div>
</div>
 -->
</body>

<script type="text/javascript">
//Initialization for ES Users
import { Ripple, initMDB } from "mdb-ui-kit";

initMDB({ Ripple });
</script>
</html>