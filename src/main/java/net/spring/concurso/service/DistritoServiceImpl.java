package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.DistritoDAO;
import net.spring.concurso.entity.Distrito;

@Service
public class DistritoServiceImpl implements DistritoService{
	
	@Autowired
	private DistritoDAO distritoDAO;
	
	@Override
	public List<Distrito> listAll() {
		return distritoDAO.listAll();
	}

	@Override
	public void save(Distrito bean) {
		distritoDAO.save(bean);
	}

	@Override
	public void update(Distrito bean) {
		distritoDAO.update(bean);	
	}

	@Override
	public void delete(int cod) {
		distritoDAO.delete(cod);
	}

}
