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
import net.spring.concurso.entity.Cargo;
import net.spring.concurso.service.CargoService;

@RestController
@RequestMapping(value = "/cargo")
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@GetMapping(path = "/listCargo")
	@ResponseBody
	public List<Cargo> listCargo() {
		return cargoService.listAll();
	}

}
