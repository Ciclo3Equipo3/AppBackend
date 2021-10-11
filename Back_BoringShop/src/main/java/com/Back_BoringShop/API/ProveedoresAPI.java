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

import com.Back_BoringShop.Dao.ProveedoresDAO;
import com.Back_BoringShop.model.Proveedores;




@RestController//estaesunaclase REST
@RequestMapping("proveedores")
public class ProveedoresAPI {

	@Autowired//inyectaladependenciadetodoslosmétodosdel JPA parausuarioDAO
	private ProveedoresDAO proveedoresDAO;
	
//private Usuario ControllerusuarioController;
	
	@PostMapping("/guardar")//Request convierteenunobjeto Java desdeunJSon
	public void guardar(@RequestBody Proveedores proveedores) {
		proveedoresDAO.save(proveedores);
	}
	
	@GetMapping("/listar")
	public List<Proveedores>listar(){
		return proveedoresDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		proveedoresDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Proveedores proveedores) {
		proveedoresDAO.save(proveedores);
	}
	
	
}
