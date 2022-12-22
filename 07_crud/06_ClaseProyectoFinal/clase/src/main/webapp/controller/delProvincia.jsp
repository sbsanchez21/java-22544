<%@page import="dao.ProvinciaDAO2"%>
<%
	String idProvincia=request.getParameter("idProvincia");
	
	ProvinciaDAO2 dao=new ProvinciaDAO2();
	Boolean delOk=dao.delProvincia(Integer.valueOf(idProvincia));
	
	if(delOk) {
		response.sendRedirect("../view/mensajeOk.jsp");
	}else {
		response.sendRedirect("../view/mensajeError.jsp");
	}
%>