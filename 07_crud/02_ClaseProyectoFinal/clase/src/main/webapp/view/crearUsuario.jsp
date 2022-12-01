<!doctype html>
<html lang="es">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Crear Usuario</title>

  <!-- Bootstrap core CSS -->
  <link href="./css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
  <div class="py-4 text-center">
    <img class="d-block mx-auto mb-4" src="./images/logo.jpg" alt="Logo caba" width="72" height="72">
    <h2>Crear Usuario</h2>
    <p class="lead">Página para crear un usuario que nos permitirá acceder al sistema.</p>
  </div>
  
    <div class="col-md-12 text-center">
    	<form action="../controller/guardarUsuario.jsp" method="POST">
		     <div class="row">
		       <div class="col-md-6 mb-3">
		         <label for="user">Usuario</label>
		         <input type="text" class="form-control" id="user" name="user" placeholder="Tu usuario" value="" required>
		         <div class="invalid-feedback">
		           Debe ingresar su nombre.
		         </div>
		       </div>
		       <div class="col-md-6 mb-3">
		         <label for="pass">Contraseña</label>
		         <input type="password" class="form-control" id="pass" name="pass" placeholder="Tu contraseña" value="" required>
		         <div class="invalid-feedback">
		           Faltó ingresar el apellido.
		         </div>
		       </div>
		     </div>    	
		     
		      <hr class="mb-4">
		      
		      <div class="row">
		        <div class="col-4"></div>
		        <div class="col-4">
		          <button class="btn btn-primary btn-lg btn-block" type="submit">Ingresar la Solicitud</button>
		        </div>
		      </div>		     
    	</form>
	</div>  

	<script src="./js/form-validation.js"></script>
</body>
</html>