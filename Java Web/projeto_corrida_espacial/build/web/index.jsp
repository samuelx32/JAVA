<%-- 
    Document   : index
    Created on : 27/11/2022, 21:45:30
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="pt-br">
	<head>
		<meta charset="uft-8">
		<link rel="stylesheet" type="text/css" href="style_form.css"/>
                <link rel="icon" href="logo.png">
                <title>Login - Corrida Espacial</title>
	</head>
	
	<body>
		<div id="tudo">
			<section id="formulario">
				<form method="post" action="sobre.jsp"> 
					<p class="titulo">Log In Corrida Espacial</p>
					<input class="campo" name="usuario" type="text" placeholder="Username"><br>
					<input class="campo" name="senha" type="password" placeholder="Password"><br>
					<input class="botao" type="submit" value="ACESSAR">	
				</form>
			</section>
			
			<section id="visual">	
				<img src="imagens/logo.png" alt="logo">
			</section>
		</div>
	</body>
</html>
