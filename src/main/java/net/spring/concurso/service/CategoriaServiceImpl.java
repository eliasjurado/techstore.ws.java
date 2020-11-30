package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.CategoriaDAO;
import net.spring.concurso.entity.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Override
	public List<Categoria> listAll() {
		return categoriaDAO.listAll();
	}


}
