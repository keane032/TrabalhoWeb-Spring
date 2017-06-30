<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Altera Produto</title>
	
	<c:url var="url_base" value="/" />
	<link rel="stylesheet" href="${url_base}css/bootstrap.css" />
	<link rel="stylesheet" href="${url_base}css/bootstrap.min.css" />

</head>
<body>
<div class="container">
	<h1>Altera Produto</h1>
	<jsp:include page="form_produto.jsp" />
</div>

<script src="${url_base}js/jquery-3.2.1.min.js"></script>
<script src="${url_base}js/bootstrap.min.js"></script>
</body>
</html>