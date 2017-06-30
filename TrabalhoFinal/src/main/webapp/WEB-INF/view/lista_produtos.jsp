<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="url_base" value="/" />
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Lista Produtos</title>
	<link rel="stylesheet" href="${url_base}css/bootstrap.min.css" />
</head>
<body>

	<c:import url="cabecalho.jsp"/>

<div class="container">
	<h1>Lista de Produtos</h1>
	<c:if test="${not empty msg}">
		<div class="alert alert-success alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>${msg}</p>
		</div>
	</c:if>
	
	<a href="/insere_produto_form" class="btn btn-primary">Novo Produto</a>
	
	<c:if test="${not empty produtos}">
	<table id="tabela_contatos" class="table table-hover">
		<thead>
			<tr><th>Nome</th><th>Valor</th><th>Quantidade</th><th>Ação</th></tr>
		</thead>
		<tbody>
		<c:forEach var="p" items="${produtos}">
			<tr><td>${p.nome}</td><td>${p.valor}</td><td>${p.qtd}</td>
			<td><a href="${url_base}altera_produto_form/${p.id}" class="btn btn-primary">Altera</a>
			<a href="${url_base}delete_produto/${p.id}" class="btn btn-danger" onclick="return confirm('Confirma remoção?')" >Deleta</a>
			<a href="${url_base}" class="btn btn-primary" >Adicionar ao Carrinho</a>
			</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</c:if>
</div>
<script src="${url_base}js/jquery-3.2.1.min.js"></script>
<script src="${url_base}js/bootstrap.min.js"></script>
<script>
</script>
</body>
</html>