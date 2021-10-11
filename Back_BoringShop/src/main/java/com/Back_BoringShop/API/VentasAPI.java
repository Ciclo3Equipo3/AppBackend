package com.Back_BoringShop.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Back_BoringShop.Dao.VentasDAO;
import com.Back_BoringShop.model.Ventas;



@RestController//estaesunaclase REST
@RequestMapping("ventas")
public class VentasAPI {

	@Autowired//inyectaladependenciadetodoslosmétodosdel JPA parausuarioDAO
	private VentasDAO ventasDAO;
	
//private Usuario ControllerusuarioController;
	
	@PostMapping("/guardar")//Request convierteenunobjeto Java desdeunJSon
	public void guardar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}
	
	@GetMapping("/listar")
	public List<Ventas>listar(){
		return ventasDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		ventasDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}
	
	
}