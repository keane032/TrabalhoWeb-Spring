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

<nav  class="container navbar navbar-inverse  navbar-fixed-top ">
<div  class="navbar-header">  
		<a class="navbar-brand" href = "/"> Nome da loja </a>

    <button class="navbar-toggle" type="button"
    data-target=".navbar-collapse" data-toggle="collapse">
    <span   class="glyphicon    glyphicon-align-justify"></span>
    </button>

</div>
		<ul class="nav navbar-right navbar-nav collapse navbar-collapse responsive">    
                <li><a href="produtos">Produtos</a></li>
                 <li><a href="clientes">Clientes</a></li>  
                <li><a href="">Carrinho</a></li> 
                <li><a href="login">LogIn</a></li> 
                <li class ="hide"><a  href="">LogOut</a></li>     
    </ul>  
	 
     <form  id = "procurar" class="navbar-form collapse navbar-collapse">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Procurar">
          </div>
        <button type="submit" class="btn btn-default">Procurar</button>
        </form>


</nav>

<div class ="jumbotron" > 
	</div>


</body>
</html>