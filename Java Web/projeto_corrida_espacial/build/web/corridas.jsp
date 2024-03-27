<%-- 
    Document   : index
    Created on : 10 de nov. de 2022, 18:23:24
    Author     : Samuel
--%>

<%@page import="view.FormUsuario"%>
<%@page import="controller.UsuarioController"%>
<%@page import="model.DAO.connectionDB.ConnectionJDBC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="style_form.css">
        <link rel="icon" href="imagens/logo.png">
        <title>Corridas</title> 
    </head>
    <body>
        <header>
            <div id="topo">
                <img src="imagens/logo.png">
            </div>

            <div id="menu">
                <a href="sobre.jsp">Home</a>
                <a href="corridas.jsp">Corridas</a>
                <a href="#">Naves</a>
                <a href="#">Estações</a>
                <a href="index.jsp">Sair</a>
            </div>
        </header>
        <div id="tudo">
            <section id="formulario">

                <form name="DadosCorrida" action="salvarCorrida.jsp" method="post" >
                    <p class="titulo">Cadastro da Corrida</p>
                    <input class="campo" name="nome" type="text" placeholder="Nome"><br>
                    <input class="campo" name="rota" type="text" placeholder="Rota"><br>
                    <input class="campo" name="data_corrida" type="text" placeholder="Data da Corrida"><br>
                    <input class="campo" name="hora_corrida" type="text" placeholder="Hora da Corrida"><br>
                    <input class="botao" type="submit" value="CADASTRAR">
                </form>

            </section>
        
            <section id="visual">	
                <img src="imagens/logo_corr.png" alt="logo">
            </section>
        </div>
        
       
    </body>
</html>
