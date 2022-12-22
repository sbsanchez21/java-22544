<!doctype html>
<html lang="es">

<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Modificar Provincia</title>
	
	<!-- Bootstrap core CSS -->
	<link href="./css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
	<div class="container">
		<div class="py-4 text-center">
			<img class="d-block mx-auto mb-4" src="./images/logo.jpg"
				alt="Logo caba" width="72" height="72">
			<h2>Modificar Provincia</h2>
		</div>
		<div class="col-md-12 text-center">
			<form action="../controller/updProvincia.jsp" method="POST">
				<div class="row">
					<div class="col-md-12 mb-3">
						<% 
						String idProvincia=request.getParameter("idProvincia");
						String nombre=request.getParameter("nombre");
						%>
						<input type="hidden" id="idProvincia" name="idProvincia" value="<% out.print(idProvincia); %>" >
						<input type="text" class="form-control" id="nombre" name="nombre" value="<% out.print(nombre); %>" required>
						<div class="invalid-feedback">
							Debe ingresar el nombre de la provincia.
						</div>
					</div>
				</div>

				<hr class="mb-4">

				<div class="row">
					<div class="col-4"></div>
					<div class="col-4">
						<button class="btn btn-primary btn-lg btn-block" type="submit">Enviar</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<script src="./js/form-validation.js"></script>
</body>
</html>