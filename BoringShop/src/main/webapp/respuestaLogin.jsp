<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){

$("#mostrar_json").click(function(){

$.post("http://localhost:8080/loginusuario2", function(data, status){

if(status="success"){

let longitud - data.length;

let salida="<table class="w3-table-all w3-hoverable w3-card-2">"; salida=salida+"<tr><th>USUARIO</th></tr>";

for (let i=0;i<longitud; i++){

//alert(data[i]_usuario); salida-salida+"<tr><td>"+data[i].data"</td><td>";

salida salida+"</table>";

$("#salida").html(salida);

</script>
</head>
<body>
</body>
</html>