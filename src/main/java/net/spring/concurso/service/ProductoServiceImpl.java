package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.ProductoDAO;
import net.spring.concurso.entity.Producto;

@Service
public class ProductoServiceImpl implements  ProductoService{
	
	@Autowired
	private  ProductoDAO  productoDAO;
	
	@Override
	public List<Producto> listAll() {
		return productoDAO.listAll();
	}

	@Override
	public List<Producto> admListAll() {
		return productoDAO.admListAll();
	}

	@Override
	public List<Producto> listById(int id) {
		return productoDAO.listById(id);
	}

	@Override
	public void save(Producto bean) {
		productoDAO.save(bean);
	}

	@Override
	public void update(Producto bean) {
		productoDAO.update(bean);
	}

	@Override
	public void delete(int cod) {
		productoDAO.delete(cod);
	}

}
