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

	@Override
	public void saveCab(CompraCabecera bean) {
		compraDAO.saveCab(bean);
	}

	@Override
	public void updateCab(CompraCabecera bean) {
		compraDAO.updateCab(bean);
	}

	@Override
	public void saveDet(CompraDetalle bean) {
		compraDAO.saveDet(bean);
	}


}
