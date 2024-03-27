<%-- 
    Document   : indexDTO.jsp
    Created on : 16 de nov. de 2022, 14:21:41
    Author     : Hially
--%>

<%@page import="view.FormUsuario"%>
<%@page import="controller.UsuarioController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 
FormUsuario user = new FormUsuario();
user.planeta = request.getParameter("planeta");
user.cep = Integer.parseInt(request.getParameter("cep"));


//out.print(user.logradouro);


   if(user.btnSalvar()){
    out.print("Salvou");
    }else{
        out.print("Não salvou");
    }

%>

