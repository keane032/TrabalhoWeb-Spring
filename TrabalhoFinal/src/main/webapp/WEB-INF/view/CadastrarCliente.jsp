<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<link rel="stylesheet" href="${url_base}css/bootstrap.min.css">
<link rel="stylesheet" href="${url_base}css/bootstrap.css">
<link rel="stylesheet" href="${url_base}css/rodape.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro</title>
</head>
<body>
	
	<c:import url="cabecalho.jsp"></c:import>
	
	<div class = "container"> 
	<form:form method="post" modelAttribute="cliente"
		action="${url_base}${acao}" id="form_cliente">
		<form:input path="id" type="hidden" />

		<spring:bind path="nome">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="nome">Nome</form:label>
				<form:input path="nome" type="text" cssClass="form-control" />
				<form:errors path="nome" />
			</div>
		</spring:bind>

		<spring:bind path="login">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="login">Login</form:label>
				<form:input path="login" type="text" cssClass="form-control" />
				<form:errors path="login" />
			</div>
		</spring:bind>

		<spring:bind path="senha">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="senha">Senha</form:label>
				<form:input path="senha" type="password" cssClass="form-control" />
				<form:errors path="senha" />
			</div>
		</spring:bind>

		<spring:bind path="endereco">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="endereco">Endereco</form:label>
				<form:input path="endereco" type="text" cssClass="form-control" />
				<form:errors path="endereco" />
			</div>
		</spring:bind>

		<button type="submit" class="btn btn-primary">Salvar</button>
	</form:form>
	</div>


	<script type="text/javascript" src="${url_base}js/jquery-3.2.1.min.js"></script>
</body>
</html>