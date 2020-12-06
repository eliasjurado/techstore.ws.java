package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.CompraDAO;
import net.spring.concurso.entity.CompraCabecera;
import net.spring.concurso.entity.CompraDetalle;

@Service
public class CompraServiceImpl implements  CompraService{
	
	@Autowired
	private  CompraDAO  compraDAO;
	
	@Override
	public List<CompraDetalle> admlistAll() {
		return compraDAO.admlistAll();
	}

	@Override
	public List<CompraDetalle> listById(int id) {
		return compraDAO.listById(id);
	}


}
