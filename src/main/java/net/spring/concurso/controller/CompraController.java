package net.spring.concurso.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import net.spring.concurso.entity.CompraCabecera;
import net.spring.concurso.entity.CompraDetalle;
import net.spring.concurso.entity.Producto;
import net.spring.concurso.service.CompraService;

@RestController
@RequestMapping(value = "/compra")
public class CompraController {

	@Autowired
	private CompraService compraService;

	@GetMapping(path = "/admListCompra")
	@ResponseBody
	public List<CompraDetalle> admListCompra() {
		return compraService.admlistAll();
	}
	
	@GetMapping(path ="/listById/{id}" )
	@ResponseBody
	public List<CompraDetalle> listById(@PathVariable("id") int id){
		List<CompraDetalle> list=null;
		list=compraService.listById(id);
		return list;
	}

}
