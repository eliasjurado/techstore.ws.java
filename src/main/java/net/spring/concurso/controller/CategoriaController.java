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
import net.spring.concurso.service.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping(path = "/listCategoria")
	@ResponseBody
	public List<Categoria> listCategoria() {
		return categoriaService.listAll();
	}
	//registrar 
	@PostMapping(path = "/saveCategoria")
	public void saveCategoria(@RequestBody Categoria bean) {
		categoriaService.save(bean);		
	}
	//actualizar 
	@PutMapping(path = "/updateCategoria")
	public void updateCategoria(@RequestBody Categoria bean) {
		categoriaService.update(bean);		
	}	
	//eliminar 
	@DeleteMapping(path = "/deleteCategoria/{cod}")
	public void deleteCategoria(@PathVariable("cod") int cod) {
		categoriaService.delete(cod);
	}

}
