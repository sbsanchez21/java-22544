<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="dataBase.ConexionDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">

<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/index.css">
</head>

<body>
	<header>
		<!-- place navbar here -->
	</header>
	<main>
	<div class="container">
	
	<h4 class="my-3" onclick="saludo()">Listado de Profesores</h4>
	
	 <div class="table-responsive">
	        <table class="table table-primary">
	            <thead class="table-dark">
	                <tr>
	                    <th scope="col">#Id</th>
	                    <th scope="col">Nombre</th>
	                    <th scope="col">Apellido</th>
	                    <th scope="col">Teléfono</th>
	                </tr>
	            </thead>
	            <tbody>
	                <% 
					ConexionDB conexionDB=new ConexionDB();
	                Statement st= conexionDB.conectarCreateStatement();
	                ResultSet rs=st.executeQuery("SELECT * FROM profesores ORDER BY apellido");
	                
	                while(rs.next()) {
	                	out.println("<tr>");

	                	out.println("<td>");
	                	out.println(rs.getInt("id"));
	                	out.println("</td>");

	                	out.println("<td>");
	                	out.println(rs.getString("nombre"));
	                	out.println("</td>");
	                	
	                	out.println("<td>");
	                	out.println(rs.getString("apellido"));
	                	out.println("</td>");

	                	out.println("<td>");
	                	out.println(rs.getInt("telefono"));
	                	out.println("</td>");

	                	
	                	out.println("</tr>");
	                }
	                
	
	                
	                %>
	            </tbody>
	        </table>
	    </div>	
	</div>
	</main>
	<footer>
		<!-- place footer here -->
	</footer>
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous">
  </script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
		crossorigin="anonymous">
  </script>

	<script src="js/index.js"></script>
</body>

</html>





