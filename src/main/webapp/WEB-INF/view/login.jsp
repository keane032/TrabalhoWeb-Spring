<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<c:url var="url_base" value="/" />
<link rel="stylesheet" href="${url_base}css/bootstrap.min.css">
<link rel="stylesheet" href="${url_base}css/bootstrap.css">
<link rel="stylesheet" href="${url_base}css/rodape.css">
<link rel="stylesheet" href="${url_base}css/Login.css">

</head>
<body>
	
	<c:import  url="cabecalho.jsp"></c:import>
	
	<form action="logar" method="post">
		<div class="imgcontainer">
			<img src="${url_base}img/doge.jpg" alt="Avatar" class="avatar">
		</div>
		<div class="container">
			<label><b>login</b></label> <br>
			<input type="text" placeholder="Entre Nome" name="login" required>
			<br> <label><b>Senha</b></label><br> <input
				type="password" placeholder="Entre Senha" name="senha" required>
			<br>
			<button type="submit">Entrar</button>
			<a href="insere_cliente_form"><button type="button">Criar Conta</button></a>
		</div>
	</form>

<script type="text/javascript" src = "${url_base}js/LogadoFile.js"></script>
	<script type="text/javascript" src="${url_base}js/jquery-3.2.0.min.js"></script>
</body>
</html>
