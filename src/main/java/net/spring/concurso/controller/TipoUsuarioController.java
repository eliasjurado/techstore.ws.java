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
import net.spring.concurso.entity.TipoUsuario;
import net.spring.concurso.service.TipoUsuarioService;

@RestController
@RequestMapping(value = "/tipoUsuario")
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioService tipoUsuarioService;

	@GetMapping(path = "/listTipoUsuario")
	@ResponseBody
	public List<TipoUsuario> listCargo() {
		return tipoUsuarioService.listAll();
	}

}
