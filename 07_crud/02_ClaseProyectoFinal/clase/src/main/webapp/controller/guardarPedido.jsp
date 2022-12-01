<%@page import="dao.PedidoDAO"%>
<%@page import="model.Pedido"%>
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
	String nombre =request.getParameter("firstName");
	String apellido =request.getParameter("lastName");
	String usuario =request.getParameter("username");
	String mail =request.getParameter("email");
	String lugarentrega =request.getParameter("address");
	String localidad = request.getParameter("country");
	String provincia =request.getParameter("state");
	String codpostal =request.getParameter("zip");
	String formadepago =request.getParameter("paymentMethod");
	String tarjtitular =request.getParameter("cc-name");
	String tarjnumero =request.getParameter("cc-number");
	String tarjvto =request.getParameter("cc-expiration");
	String tarjclave =request.getParameter("cc-cvv");
	
	//Creo un objeto pedido para guardarlo en la bas de datos
	//esto es necesario porque trabajo con POO
	%>


</body>
</html>