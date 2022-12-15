<%@page import="dao.ProvinciaDAO2"%>
<%
	String idProvincia=request.getParameter("idProvincia");
	String nombre=request.getParameter("nombre");
	
	ProvinciaDAO2 dao=new ProvinciaDAO2();
	Boolean updOk=dao.updProvincia(Integer.valueOf(idProvincia), nombre);
	
	if(updOk) {
		response.sendRedirect("../view/mensajeOk.jsp");
	}else {
		response.sendRedirect("../view/mensajeError.jsp");
	}
%>