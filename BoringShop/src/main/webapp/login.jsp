<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Usuario</title>

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script src="login.js"></script><!--Incorporo al proyecto javascript -->
</head>
<body>
<h1>CREDENCIALES DE INGRESO A LA TIENDA VIRTUAL</h1>
	<form>
		<table>
			<tr>
				<td><label>Usuario: </label></td> 
				<td><input Id="usuario" type="text" value=""></td>

				<td><label>Clave:</label></td> 
				<td><input Id="clave" type="text" value=""></td>
			</tr>
			<tr>
				<td><input type="button" value="Envioru" id="btn_Enviaru"></td></tr> 
				<!-- <tr><td><button id="btnEnviar" class="w3-button">Enviar</button></td></tr>-->
		</table>
	</form>
</body>
</html>