<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>        
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:import url="cabecalho.jsp"></c:import>

<div class = "container">
	<form:form method="post" modelAttribute="endereco"
		action="${acao}">
		<form:input path="id" type="hidden" />

		<spring:bind path="Rua">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="Rua">Rua</form:label>
				<form:input path="Rua" type="text" cssClass="form-control" />
				<form:errors path="Rua" />
			</div>
		</spring:bind>

		<spring:bind path="Num">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:label path="Num">Numero Da Casa</form:label>
				<form:input path="Num" type="text" cssClass="form-control" />
				<form:errors path="Num" />
			</div>
		</spring:bind>

		<button type="submit" class="btn btn-primary">Salvar</button>
	</form:form>
</div>

</body>
</html>