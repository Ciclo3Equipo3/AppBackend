package com.BO.BoringShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.BoringShop.*;
import com.DTO.BoringShop.LoginVO;

@RestController
public class BoringShopController {
	//devuelve true o false si existe el usuario
	@RequestMapping("/loginusuario2")
	public Map<String,Boolean> validarlogin2(String usuario, String clave)//recibe esta cadena y convierte en un objeto de
	{
		ArrayList<LoginVO> miusuario=new ArrayList<LoginVO>();//Crea el objeto arraylist
		
		//pasa la petición al servicio
	LoginDAO Dao=new LoginDAO(); //cargamos el objeto y se pasa al DAO y registra el usuario
		miusuario=Dao.consultarUsuario(usuario, clave);
		if(miusuario.isEmpty())
		{
			return Collections.singletonMap("existe", false);
		}
		else
		{
			return Collections.singletonMap("existe", true);
		}
		
	}
}