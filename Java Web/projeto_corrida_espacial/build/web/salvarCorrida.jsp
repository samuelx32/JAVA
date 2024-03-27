<%-- 
    Document   : indexDTO.jsp
    Created on : 16 de nov. de 2022, 14:21:41
    Author     : Samuel e Erick
--%>

<%@page import="view.FormCorrida"%>
<%@page import="controller.CorridaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 
FormCorrida corr = new FormCorrida();
corr.nome = request.getParameter("nome");
corr.rota = request.getParameter("rota");
corr.data_corrida = request.getParameter("data_corrida");
corr.hora_corrida = request.getParameter("hora_corrida");


//out.print(user.logradouro);


   if(corr.btnSalvar()){
    out.print("Salvou");
    }else{
        out.print("Não salvou");
    }

%>

