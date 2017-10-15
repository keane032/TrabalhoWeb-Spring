<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div id="header">

		<div id="carrinho">
			<h3>Meu carrinho:</h3>
			<c:if test="${empty carrinho or carrinho.totalDeItens eq 0 }">
				<span>Você não possui itens no seu carrinho</span>
			</c:if>
			<c:if test="${carrinho.totalDeItens > 0 }">
				<ul>
					<li><strong>Itens:</strong> ${carrinho.totalDeItens}</li>
					<li><strong>Total:</strong> <fmt:formatNumber type="currency"
							value="${carrinho.total}" /></li>
				</ul>
			</c:if>
		</div>
	</div>


</body>
</html>