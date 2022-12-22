<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

	<link href="css/estilo.css" rel="stylesheet" type="text/css">
</head>

<body class="bg-light">
    <header>
        <nav>
            <div id="header">
                <ul class="nav">
 					<li><a href="">Usuarios</a>
                        <ul>
                            <li><a href="altaUsuario.jsp">Crear Usuario</a></li>
                            <li><a href="listarUsuarios.jsp">Listado de Usuarios</a></li>
                        </ul>
                    </li>                    
 					<li><a href="">Pedidos</a>
                        <ul>
                            <li><a href="listarPedidosC.jsp">Listado de Pedidos</a></li>
                        </ul>
                    </li>                    
                    <li><a href="">Acerca de</a>
                        <ul>
                            <li><a href="">Nosotros</a></li>
                            <li><a href="">Nuestra Misión</a></li>
                            <li><a href="http://www.facebook.com">Historia</a></li>
                        </ul>
                    </li>
                    <li><a href="">Contacto</a></li>
                </ul>
            </div>
        </nav>
    </header>

	<div class="py-4 text-center">
		<img class="d-block mx-auto mb-4" src="./images/logo.jpg"
			alt="Logo caba" width="72" height="72">
		<h2>Crear Usuario</h2>
		<p class="lead">Página para crear un usuario que nos permitirá
			acceder al sistema.</p>
	</div>

	<div class="container">
	<div class="col-md-12 text-center">
		<form action="../controller/guardarUsuarioC.jsp" method="POST">
			<div class="row">
				<div class="col-md-6 mb-3">
					<label for="user">Usuario</label> 
					<input type="email" class="form-control" id="user" name="user" placeholder="Tu usuario" value="" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$">
				</div>
				<div class="col-md-6 mb-3">
					<label for="pass">Contraseña</label> 
					<input type="password" class="form-control" id="pass" name="pass" placeholder="Tu contraseña" value="" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}">
				</div>
			</div>

			<hr class="mb-4">

			<div class="row">
				<div class="d-flex justify-content-around">
					<button class="btn btn-primary btn-lg btn-block" type="submit">
						Ingresar la Solicitud
					</button>
				</div>
			</div>
		</form>
	</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>