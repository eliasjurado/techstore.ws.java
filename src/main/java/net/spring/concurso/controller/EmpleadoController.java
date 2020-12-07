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

import net.spring.concurso.entity.Cliente;
import net.spring.concurso.entity.Distrito;
import net.spring.concurso.entity.Empleado;
import net.spring.concurso.service.EmpleadoService;

@RestController
@RequestMapping(value = "/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping(path = "/listEmpleado")
	@ResponseBody
	public List<Empleado> listEmpleado() {
		return empleadoService.listAll();
	}
	@GetMapping(path ="/login/{email}/{pass}" )
	@ResponseBody
	public Empleado iniciar(@PathVariable("email") String email, 
						   @PathVariable("pass") String pass){
		Empleado bean=null;
		bean=empleadoService.loginEmpleado(email, pass);
		return bean;
	}
	//registrar 
	@PostMapping(path = "/saveEmpleado")
	public void saveEmpleado(@RequestBody Empleado bean) {
		empleadoService.save(bean);		
	}
	//actualizar 
	@PutMapping(path = "/updateEmpleado")
	public void updateEmpleado(@RequestBody Empleado bean) {
		empleadoService.update(bean);		
	}	
	//eliminar 
	@DeleteMapping(path = "/deleteEmpleado/{cod}")
	public void deleteEmpleado(@PathVariable("cod") int cod) {
		empleadoService.delete(cod);
	}
}
