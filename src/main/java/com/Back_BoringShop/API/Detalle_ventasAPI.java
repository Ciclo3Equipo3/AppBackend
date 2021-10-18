package com.Back_BoringShop.API;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Back_BoringShop.Dao.Detalle_ventasDAO;
import com.Back_BoringShop.model.Detalle_ventas;



@RestController
@RequestMapping("detalle_ventas")

public class Detalle_ventasAPI {
	
	@Autowired
	private Detalle_ventasDAO detalle_ventasDAO;
	

	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Detalle_ventas detalle_ventas) {
		detalle_ventasDAO.save(detalle_ventas);
	}

}
