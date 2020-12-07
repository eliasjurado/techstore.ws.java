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
import net.spring.concurso.service.DistritoService;

@RestController
@RequestMapping(value = "/distrito")
public class DistritoController {

	@Autowired
	private DistritoService distritoService;

	@GetMapping(path = "/listDistrito")
	@ResponseBody
	public List<Distrito> Distrito() {
		return distritoService.listAll();
	}
	//registrar 
	@PostMapping(path = "/saveDistrito")
	public void saveDistrito(@RequestBody Distrito bean) {
		distritoService.save(bean);		
	}
	//actualizar 
	@PutMapping(path = "/updateDistrito")
	public void updateDistrito(@RequestBody Distrito bean) {
		distritoService.update(bean);		
	}	
	//eliminar 
	@DeleteMapping(path = "/deleteDistrito/{cod}")
	public void deleteDistrito(@PathVariable("cod") int cod) {
		distritoService.delete(cod);
	}
}
