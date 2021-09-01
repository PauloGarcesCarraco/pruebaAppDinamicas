<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">

<style type="text/css">
.formulario {
	margin-top: 2%;
	margin-left: 10%;
	margin-right: 10%
}

.titulo {
	margin-top: 2%;
	margin-left: 5%
}
</style>

<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg class=" navbar
		navbar-light" style="background-color: #e3f2fd;"">
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
					<li class="nav-item "><a class="nav-link"
						href="listarProducto"><b>Lista de Productos</b></a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"><b>
								Acciones</b> </a>
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

	<div class="titulo">
		<h4>Agregar producto</h4>
	</div>

	<div class="formulario">
		<form action="agregarProducto" method="POST">
			<div class="mb-3">
				<label for="nombreProducto" class="form-label">Nombre
					producto</label> <input type="text" class="form-control"
					id="nombreProducto" name="nombre_producto">
			</div>
			<div class="mb-3">
				<label for="precioProducto" class="form-label">Precio
					producto</label> <input type="number" class="form-control"
					id="precioProducto" name="precio_producto">
			</div>
			<div class="mb-3">
				<label for="descripcionProducto" class="form-label">Descripcion
					producto</label> <input type="text" class="form-control"
					id="descripcionProducto" name="descripcion_producto">
			</div>
			<div class="mb-3">
				<label for="categoria" class="form-label">Categoria</label> <select
					name="categoria_producto" id="categoria">
					<c:forEach items="${listaCategoria}" var="categoriaTemp">
						<option value="${categoriaTemp.getIdCategoria()}">${categoriaTemp.getNombrCategoria()}</option>
					</c:forEach>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous"></script>

</body>
</html>