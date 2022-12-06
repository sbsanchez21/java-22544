<%@page import="dao.ProvinciaDAO2"%>
<%
	String nombre=request.getParameter("nombre");
	
	ProvinciaDAO2 dao=new ProvinciaDAO2();
	Boolean insertOk=dao.addProvincia(nombre);
	
	if(insertOk) {
		response.sendRedirect("../view/mensajeOk.jsp");
	}else {
		response.sendRedirect("../view/mensajeError.jsp");
	}
%>