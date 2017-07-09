<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<c:url var="url_base" value="/" />
<link rel="stylesheet" href="${url_base}css/bootstrap.min.css">
<link rel="stylesheet" href="${url_base}css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clientes</title>
</head>

<body>

<c:import url="cabecalho.jsp"></c:import>

<div class="container">
	<h1>Lista de Clientes</h1>
	<c:if test="${not empty msg}">
		<div class="alert alert-success alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>${msg}</p>
		</div>
	</c:if>
	
	<c:if test="${not empty clientes}">
	<table id="tabela_contatos" class="table table-hover">
		<thead>
			<tr><th>Nome</th><th>Rua</th><th>Ação</th></tr>
		</thead>
		<tbody>
		<c:forEach var="c" items="${clientes}">
			<tr><td>${c.nome}</td><td>${c.endereco}</td>
			<td><a href="${url_base}altera_cliente_form/${c.id}" class="btn btn-primary">Altera</a>
			<a href="${url_base}delete_cliente/${c.id}" class="btn btn-danger" onclick="return confirm('Confirma remoção?')" >Deleta</a>
			</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</c:if>
</div>

<script src="${url_base}js/jquery-3.2.1.min.js"></script>
<script src="${url_base}js/bootstrap.min.js"></script>

</body>
</html>