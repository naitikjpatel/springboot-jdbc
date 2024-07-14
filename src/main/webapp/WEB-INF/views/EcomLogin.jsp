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



	

<!-- 
<form action="elogin" method="post">
	<input type="email" name="email" placeholder="Enter the Email id"/><br><br>
	<input type="password" name="password" placeholder="Enter the password"/> <br/> <br/>
	<input type="submit" value="submit"/>
	
	
</form>
</div> -->
<div class="container-fluid">

		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">

				<h2>Ecom Login</h2>


				<form action="elogin" method="post">
					<div class="form-group">
						Email: <input type="text" name="email" class="form-control" />
					</div>

					<div class="form-group">
						Password: <input type="password" name="password"
							class="form-control" />
					</div>


					<input type="submit" value="Login"  class="btn btn-success m-2" />

				</form>
				<br> 

				<span class="text-danger">${error}</span>

			</div>


		</div>

	</div>

</body>
</html>