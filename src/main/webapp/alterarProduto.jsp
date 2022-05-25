<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/AlterarProduto" var="linkServletAlterarProduto"/>

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
					class="nav-link"> Produtos </a></li>
			</ul>
			<ul class="navbar-nav">
                 <li><a href="<%=request.getContextPath()%>/creditosAlunos.jsp"
                     class="nav-link">Creditos da dupla</a></li>
            </ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				
				<caption>
					<h2>Editar Produto</h2>
				</caption>

				<form action="${linkServletAlterarProduto}" method="POST">
				
				<fieldset class="form-group">
				<input class="form-control" type="hidden" name="id" value="${produto.id}">
				</fieldset>

				<fieldset class="form-group">
					<label>Nome</label> <input type="text"
						value="${produto.nome}" class="form-control"
						name="nome" >
				</fieldset>

				<fieldset class="form-group">
					<label>Unidade de Compra</label> <input type="text"
						value="${produto.unidadeCompra}" class="form-control"
						name="unidadeCompra">
				</fieldset>

				<fieldset class="form-group">
					<label>Descrição</label> <input type="text"
						value="${produto.descricao}" class="form-control"
						name="descricao">
				</fieldset>

				<fieldset class="form-group">
                     <label>Qtd Previsto por Mês</label>
                     <input type="text" value="${produto.qtdPrevistoMes}"  class="form-control"  name="qtdPrevistoMes">
                </fieldset>

                <fieldset class="form-group">
                        <label>Preço Maximo Comprado</label>
                        <input type="text"  value="${produto.precoMaxComprado}"class="form-control" name="precoMaxComprado" >
                 </fieldset>

				<button type="submit" class="btn btn-success">Salvar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>