
<%@page import="dao.UsuarioDAO2"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	//recibir los inputs ingresados por el usuario y enviados con metodo post del formulario
	String user=request.getParameter("user");
	String pass=request.getParameter("pass");
// 	out.println(user);
// 	out.println(pass);
	
	//conectarnos a la db y verificar que exista el user pass
	UsuarioDAO2 usuarioDAO=new UsuarioDAO2();
	Boolean sonValidos=usuarioDAO.validarUsuYPass(user, pass);
	
	if(sonValidos) {
		response.sendRedirect("../view/inicio.html");
	} else {
		response.sendRedirect("../view/loginError.html");
	}
%>