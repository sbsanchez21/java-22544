<!doctype html>
<%@page import="dao.ProvinciaDAO2"%>
<%@page import="model.Provincia"%>
<%@page import="dao.PedidoDAO2"%>
<%@page import="model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="dao.UsuarioDAO2"%>
<html lang="en">

<head>
	<title>Listado de Provincias</title>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS v5.2.1 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

	<!-- bootstrap icons -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
	
</head>

<body class="text-center bg-light">
	<header>
		<!-- place navbar here -->
	</header>
	<main>
		<div class="container">
			<div class="py-4">
				<img src="images/logo.jpg" alt="Logo" width="72" height="72">
				<p class="lead py-3">Listado de Provincias</p>
			</div>
			
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Open modal for @mdo</button>
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@fat">Open modal for @fat</button>
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@getbootstrap">Open modal for @getbootstrap</button>

	

			

			<table class="table">
				<thead class="table-dark">
				  <tr>
					<th scope="col">#ID</th>
					<th scope="col">Nombre</th>
					<th scope="col">Operaciones</th>
				  </tr>
				</thead>
				<tbody>
				<% 
				ProvinciaDAO2 dao=new ProvinciaDAO2();
				List<Provincia> listProv=dao.listarProvincias();

				
				for(Provincia prov: listProv) {
					out.println("<tr>");

					out.println("<td>");
					out.println(prov.getIdProvincia());
					out.println("</td>");

					out.println("<td>");
					out.println(prov.getNombre());
					out.println("</td>");
					
					out.println("<td>");
					out.println("<a href='modifProvincia.jsp?idProvincia="+prov.getIdProvincia()+"&nombre="+prov.getNombre()+"'>");
					out.println("<i class='bi bi-pencil-fill'></i>");
					out.println("</a>");
					
					out.println("<a href='#' data-bs-toggle='modal' data-bs-target='#exampleModal'>");
					out.println("<i class='bi bi-trash-fill'></i>");
					out.println("</a>");
				
					out.println("</td>");
			
					out.println("</tr>");
					
				}
				
				%>

				</tbody>
			</table>
			
			
			<!-- Modal -->
			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h1 class="modal-title fs-5" id="exampleModalLabel">New message</h1>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        <form>
			          <div class="mb-3">
			            <label for="recipient-name" class="col-form-label">Recipient:</label>
			            <input type="text" class="form-control" id="recipient-name">
			          </div>
			          <div class="mb-3">
			            <label for="message-text" class="col-form-label">Message:</label>
			            <textarea class="form-control" id="message-text"></textarea>
			          </div>
			        </form>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
			        <button type="button" class="btn btn-primary">Send message</button>
			      </div>
			    </div>
			  </div>
			</div>		
						
		</div>

		
	</main>
	<footer>
		<!-- place footer here -->
	</footer>
	<!-- Bootstrap JavaScript Libraries -->
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
		</script>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
		</script>
		
	<script src="js/script.js"></script>	
</body>

</html>