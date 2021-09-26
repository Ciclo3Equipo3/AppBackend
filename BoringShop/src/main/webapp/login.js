
//JQuery para capturar el servicio
$(document).ready(function(){
    $("#btn_Enviaru").click(function(){
        let elUsuario = document.getElementById("usuario").value;
        let laClave = document.getElementById("clave").value;
        if(elUsuario != "" && laClave != ""){
            try{
                $.ajax({
                    url:"http://localhost:8080/loginusuario2",
                    type: 'POST',
                    data: "usuario=" + elUsuario + "&" + "password=" + laClave,
                    dataType: 'JSON',
                     success: function (response) {
                        if(response.existe == true){
                            alert("Bienvenido!!");
							window.location.href = "respuestaLogin.jsp";
                        } else {
                            alert("No existe este usuario o la clave esta erronea!!");
                        }
                    },
                    error: function(response){
                        alert(response);
                    }
                })
            }catch(error){
                alert(error);
            }
        } else {
            console.log("Error Aqui");
        }
    });
});