<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<c:url var="url_base" value="/" />
<link rel="stylesheet" href="${url_base}css/bootstrap.min.css">
<link rel="stylesheet" href="${url_base}css/bootstrap.css">
<link rel="stylesheet" href="${url_base}css/carousel.css">
<link rel="stylesheet" href="${url_base}css/rodape.css">
</head>
<body>

	<nav class="container navbar navbar-inverse  navbar-fixed-top ">
	<div class="navbar-header">
		<a class="navbar-brand" href="/"> Nome da loja </a>

		<button class="navbar-toggle" type="button"
			data-target=".navbar-collapse" data-toggle="collapse">
			<span class="glyphicon    glyphicon-align-justify"></span>
		</button>

	</div>
	<ul
		class="nav navbar-right navbar-nav collapse navbar-collapse responsive">
		<c:choose>
			<c:when test="${tipo == 1}">
				<li id="l1"><a href="produtos">Produtos</a></li>
                 <li id="l2"><a href="clientes">Clientes</a></li>
			</c:when>
		</c:choose>
		<c:if test="${usuario != null}">
			<li id="l3"><a href="deslogar">LogOut</a></li>
		</c:if>
		<c:if test="${usuario == null}">
			<li id="l4"><a href="login">LogIn</a></li>
		</c:if>
		

	</ul>
	<form action="buscar" method="post"
		class="navbar-form collapse navbar-collapse">
		<div class="form-group">
			<input type="text" class="form-control" placeholder="Procurar"
				name="procurar">
		</div>
		<button type="submit" class="btn btn-default">Procurar</button>
	</form>


	</nav>

	<div class="jumbotron"></div>

	<script type="text/javascript" src="js/LogadoFile.js"></script>
	<script type="text/javascript" src="${url_base}js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${url_base}js/jquery-3.2.0.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>