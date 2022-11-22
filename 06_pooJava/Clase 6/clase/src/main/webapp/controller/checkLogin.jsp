
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="dataBase.ConexionDB"%>
<%
	String user=request.getParameter("user");
	String pass=request.getParameter("pass");
	
	//out.println(user);
	//out.println(pass);
	
	ConexionDB con=new ConexionDB();
	Statement st=con.crearStatement();
	
	ResultSet rs=st.executeQuery("SELECT * FROM usuarios WHERE user='"+ user +"' AND pass='"+pass+"' ");
	
	if(rs.next()) {
		response.sendRedirect("../listadoAlumnDB.jsp");
	}else{
		response.sendRedirect("../error.jsp");
	}
%>