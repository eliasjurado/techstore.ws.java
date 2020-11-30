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

}
