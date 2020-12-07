package net.spring.concurso.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Categoria;
import net.spring.concurso.entity.Cliente;
import net.spring.concurso.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping(path = "/listCliente")
	@ResponseBody
	public List<Cliente> listCliente() {
		return clienteService.listAll();
	}
	
	@GetMapping(path ="/login/{email}/{pass}" )
	@ResponseBody
	public Cliente iniciar(@PathVariable("email") String email, 
						   @PathVariable("pass") String pass){
		Cliente bean=null;
		bean=clienteService.loginCliente(email, pass);
		return bean;
	}
	//registrar 
	@PostMapping(path = "/saveCliente")
	public void saveCliente(@RequestBody Cliente bean) {
		clienteService.save(bean);		
	}
	//actualizar 
	@PutMapping(path = "/updateCliente")
	public void updateCliente(@RequestBody Cliente bean) {
		clienteService.update(bean);		
	}	
	//eliminar 
	@DeleteMapping(path = "/deleteCliente/{cod}")
	public void deleteCliente(@PathVariable("cod") int cod) {
		clienteService.delete(cod);
	}

}
