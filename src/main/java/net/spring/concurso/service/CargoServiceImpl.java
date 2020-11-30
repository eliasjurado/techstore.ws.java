package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.CargoDAO;
import net.spring.concurso.entity.Cargo;

@Service
public class CargoServiceImpl implements CargoService{
	
	@Autowired
	private CargoDAO cargoDAO;
	
	@Override
	public List<Cargo> listAll() {
		return cargoDAO.listAll();
	}


}
