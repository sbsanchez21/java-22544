<%@page import="dao.UsuarioDAOC"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String usu = request.getParameter("inputEmail");
	String pass = request.getParameter("inputPassword");
	
	UsuarioDAOC dao = new UsuarioDAOC();
	Boolean valido = dao.validarUsuYPass(usu, pass);

	if(valido) {
		response.sendRedirect("../view/inicio.html");
	} else {
		response.sendRedirect("../view/loginError.html");
	}	
	
	
// 	if(dao.validarUsuYPass(usu, pass)) {
// 		response.sendRedirect("../view/pedido.jsp");
// 	}
	
// 	response.sendRedirect("../view/loginError.html");
			
			
	%>


</body>
</html>