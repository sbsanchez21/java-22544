<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/index.css"	>

</head>
<body>

	<h4>Hola mundo</h4>
	
	
	<%
	//conectarnos a la db
	//consultar los alumnos
	//generar una tabla de manera dinámica, 10 alumnos -> 10 filas, 8 al -> 8filas
	//enviar al cliente
	
	String mensaje=new String("hola jsp con string");
	Integer anio=new Integer(2);
	anio++;
	
	out.println("<p>Hola jsp</p>");
	
	for(int i=0; i<14; i++) {
		out.println("<div>Líneas dinámicas " + i + "</div>");
		
	}
	
	%>


</body>
</html>