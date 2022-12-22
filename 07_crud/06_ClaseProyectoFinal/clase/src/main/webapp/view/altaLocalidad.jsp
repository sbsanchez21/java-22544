<!doctype html>
<%@page import="model.Provincia"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProvinciaDAO2"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Alta localidades</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>

  <body class="text-center">
  	
  	<div class="container">
  		<div class="m-3">
  			<img alt="logo" src="images/logo.jpg" width="72" heigth="72" class="mb-3">
  			<h4 class="mb-3">Alta Localidad</h4>
  		</div>
  		
  		<form action="../controller/addLocalidad.jsp" method="post">
  			<div class="row">
  				<div class="col-md-6 mb-3">
		  			<input type="text" name="nombre" class="form-control" placeholder="Ingresar nombre de localidad" required>
  				</div>
  				<div class="col-md-6 mb-3">
				  <select class="form-select" name="idProv" >
				    <option selected>Seleccione la provincia</option>
				    <% 
				    ProvinciaDAO2 dao=new ProvinciaDAO2();
				    List<Provincia> listProv=dao.listarProvincias();
				    
				    for(Provincia prov: listProv) {
				    	out.println("<option value="+prov.getIdProvincia()+">"+prov.getNombre()+"</option>");
				    }
				    
				    
				    %>
				    
				    
				  </select>
  				</div>
  				
  				<div class="row">
  					<input type="submit" value="Enviar" class="btn btn-primary">
  				</div>
  			</div>
  		</form>
  	</div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>
