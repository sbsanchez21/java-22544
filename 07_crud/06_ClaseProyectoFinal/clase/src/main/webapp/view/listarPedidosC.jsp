<!doctype html>

<%@page import="model.Pedido"%>
<%@page import="java.util.List"%>
<%@page import="dao.PedidoDAOC"%>
<html lang="en">

<head>
  <title>Listado Pedidos</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body class="text-center bg-light">

  <div class="container">
    <div class="py-4 text-center">
      <img class="d-block mx-auto mb-4" src="./images/logo.jpg" alt="Logo caba" width="72" height="72">
      <p class="lead">Listado de Pedidos</p>
    </div>

    <table class="table table-hover table-sm">
      <thead class="thead-dark">
        <tr>
          <th scope="col">#ID</th>
          <th scope="col">Nombre</th>
          <th scope="col">Apellido</th>
          <th scope="col">Email</th>
          <th scope="col">Domicilio</th>
          <th scope="col">Localidad</th>
          <th scope="col">Provincia</th>
          <th scope="col">Código POstal</th>
          <th scope="col">Operaciones</th>
        </tr>
      </thead>
      <tbody>

        <%
        PedidoDAOC dao = new PedidoDAOC();
        List<Pedido> listPed = dao.listarPedidos();
        
        for(Pedido pedido: listPed) {
        	out.println("<tr>");
        	out.println("<td>");
        	out.println(pedido.getIdPedido());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getNombre());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getApellido());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getMail());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getLugarEntrega());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getLocalidad().getNombre());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getLocalidad().getProvincia().getNombre());
        	out.println("</td>");
        	out.println("<td>");
        	out.println(pedido.getCodPostal());
        	out.println("</td>");
        	out.println("<td>");
        	%>
	          <a href="editarPedidoC.jsp?idPedido=<% out.println(pedido.getIdPedido()); %>">
	          edit
	          </a>
        	
        	<% 
        	out.println("</td>");
        	out.println("</tr>");
        }
      

        %>
        
      </tbody>
    </table>


  </div>


  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>

</html>