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
	
	try {
		String usu = request.getParameter("user");
		String pass = request.getParameter("pass");
		//TODO: validar parametros, not null, email, pass
		UsuarioDAOC dao = new UsuarioDAOC();
		
		Boolean insertOk = dao.guardarUsuario(usu, pass);
		
		if(insertOk) {
			response.sendRedirect("../view/mensajeOk.jsp");
		}else {
			response.sendRedirect("../view/mensajeError.jsp");
		}

	} catch (Exception e) {
		response.sendRedirect("../view/mensajeError.jsp");
		e.printStackTrace();	
	}
	
	
	%>

</body>
</html>