package net.spring.concurso.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import net.spring.concurso.entity.Distrito;
import net.spring.concurso.service.DistritoService;

@RestController
@RequestMapping(value = "/distrito")
public class DistritoController {

	@Autowired
	private DistritoService distritoService;

	@GetMapping(path = "/listDistrito")
	@ResponseBody
	public List<Distrito> listDistrito() {
		return distritoService.listAll();
	}

}
