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

import com.Back_BoringShop.Dao.ProductosDAO;
import com.Back_BoringShop.model.Productos;



@RestController//estaesunaclase REST
@RequestMapping("productos")
public class ProductosAPI {

	@Autowired//inyectaladependenciadetodoslosmétodosdel JPA parausuarioDAO
	private ProductosDAO productosDAO;
	
//private Usuario ControllerusuarioController;
	
	@PostMapping("/guardar")//Request convierteenunobjeto Java desdeunJSon
	public void guardar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
	@GetMapping("/listar")
	public List<Productos>listar(){
		return productosDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		productosDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
	
}