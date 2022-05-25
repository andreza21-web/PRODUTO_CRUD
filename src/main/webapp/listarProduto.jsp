<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>CRUD TP02</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a  class="navbar-brand" style="color: white"> CRUD Produtos </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/listarProduto.jsp"
					class="nav-link">Produtos</a></li>
			</ul>

			<ul class="navbar-nav">
            	<li><a href="<%=request.getContextPath()%>/creditosAlunos.jsp"
            		class="nav-link">Creditos da dupla</a></li>
            </ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<div class="container">
			<h3 class="text-center">Lista de Produtos</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/adicionarProduto.jsp" class="btn btn-success">Adicionar Novo Produto </a>
			</div>
			<br>
			<table  class="table table-hover">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Unidade de Compra</th>
						<th>Descricao</th>
						<th>Qtd Previsto Mes</th>
						<th>Preco Max Comprado</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					
					<c:forEach items="${produtos}" var="produto">

						<tr>
						
						
							<td>${produto.id}</td>
							<td>${produto.nome}</td>
							<td>${produto.unidadeCompra}</td>
							<td>${produto.descricao}</td>
							<td>${produto.qtdPrevistoMes}</td>
							<td>${produto.precoMaxComprado}</td>
							<td><a href="/Produto/buscarProduto?id=${produto.id}">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="/Produto/RemoveProduto?id=${produto.id}">Delete</a></td>
						</tr>
					
						
					</c:forEach>
				
				</tbody>

			</table>
				
		</div>
	</div>
</body>
</html>
