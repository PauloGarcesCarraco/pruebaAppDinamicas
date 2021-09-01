<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">

<style type="text/css">
.textoInicio {
	text-align: center;
	margin-top: 1rem
}

.container {
	padding-left: 10%;
	padding-right: 10%;
	text-align : center;
	margin-top: 1rem;
	display: inline-flex;
	margin-top: 1rem;
	text-align: center;
	text-align: center
}

.agregar {
	margin-inline: 4rem
}

.eliminar {
	margin-inline: 4rem
}

.modificar {
	margin-inline: 4rem
}

.listar {
	margin-inline: 4rem
}
</style>

<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg class="navbar navbar-light" style="background-color: #e3f2fd;"">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://www.graphicsprings.com/filestorage/stencils/8dfd146f62819230474e8c67edcbe197.png"
				alt="" width="100px">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp"><b>Home</b></a></li>
					<li class="nav-item "><a class="nav-link" href="listarProducto"><b>Lista
							de Productos</b></a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"><b> Acciones</b> </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="agregarProducto">Agregar
									producto</a></li>
							<li><a class="dropdown-item" href="EliminarProducto">Eliminar
									producto</a></li>
							<li><a class="dropdown-item" href="ModificarProducto">Modificar
									Producto</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="textoInicio">

		<h2>Bienvenido!</h2>
	</div>


	<div class="container">
		<div class="agregar">
			<img alt=""
				src="https://static.thenounproject.com/png/3658249-200.png"
				width="100px"><br> <a href="agregarProducto">Agregar
				Producto</a>
		</div>

		<div class="eliminar">
			<img alt=""
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7r8rYevKcwyjRzf--Eu_7tpkrdYtKnJp8lw&usqp=CAU"
				width="100px"><br> <a href="EliminarProducto">Eliminar
				Producto</a>
		</div>


		<div class="modificar">
			<img alt=""
				src="https://static.thenounproject.com/png/2675933-200.png"
				width="100px"><br> <a href="ModificarProducto">Modificar
				Producto</a>

		</div>

		<div class="listar">
			<img alt=""
				src="https://cdn4.iconfinder.com/data/icons/flat-pro-database-set-3/32/table-512.png"
				width=100px"><br> <a href="listarProducto">Listar
				Producto</a>
		</div>






	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous"></script>

</body>
</html>