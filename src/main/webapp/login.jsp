<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<style type="text/css">
.card {
	margin-top: 3%;
	margin-left: 30%;
	margin-right: 30%
}

.login {
	text-align: center;
}
</style>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

</head>
<body>
	<div class="loginTarjeta" id="loginTarjeta">
		<div class="card bg-light mb-3" style="width: 18rem;">
			<img class="card-img-top"
				src="https://www.graphicsprings.com/filestorage/stencils/8dfd146f62819230474e8c67edcbe197.png"
				alt="Card image cap">
			<div class="card-body">
				<h6 class="card-title">
					<small>Producto Limpieza</small>
				</h6>
				<div class="login">
					<h5>Login</h5>
				</div>
				<form action="procesaLogin" method="post">
					<label for="">Usuario</label> <input type="text"
						name="nombreUsuario"> <label for="">Contraseña</label><input
						type="password" name="pass">
					<div>
						<br>
					</div>
					<button type="submit" class="btn btn-primary">Entrar</button>
				</form>

			</div>
		</div>
	</div>




</body>
</html>