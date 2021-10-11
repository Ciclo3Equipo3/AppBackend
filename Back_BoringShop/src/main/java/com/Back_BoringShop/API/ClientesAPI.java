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

import com.Back_BoringShop.Dao.ClientesDAO;
import com.Back_BoringShop.model.Clientes;




@RestController//estaesunaclase REST
@RequestMapping("clientes")
public class ClientesAPI {

	@Autowired//inyectaladependenciadetodoslosmétodosdel JPA parausuarioDAO
	private ClientesDAO clientesDAO;
	
//private Usuario ControllerusuarioController;
	
	@PostMapping("/guardar")//Request convierteenunobjeto Java desdeunJSon
	public void guardar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}
	
	@GetMapping("/listar")
	public List<Clientes>listar(){
		return clientesDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		clientesDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}
	
	
}