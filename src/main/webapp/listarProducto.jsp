<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">

<style type="text/css">
.tablas {
	margin-top: 2%;
	margin-left: 10%;
	margin-right: 10%
}
.titulo{
margin-top:2%;
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
<h4>Lista de producto</h4>
</div>

	<div class="tablas">
		<table class="table">
			<tr>
				<th>Id Producto</th>
				<th>Nombre Producto</th>
				<th>Precio producto</th>
				<th>Descripcion</th>
				<th>Categoria</th>

			</tr>
			<c:forEach items="${listaPC}" var="listaTemp">
				<tr>
					<td>${listaTemp.getProducto().getIdProducto()}</td>
					<td>${listaTemp.getProducto().getNombreProducto()}</td>
					<td>${listaTemp.getProducto().getPrecioProducto()}</td>
					<td>${listaTemp.getProducto().getDescripcionProducto()}</td>
					<td>${listaTemp.getCategoria().getNombrCategoria()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous"></script>


</body>
</html>