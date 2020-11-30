package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.TipoUsuarioDAO;
import net.spring.concurso.entity.TipoUsuario;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService{
	
	@Autowired
	private TipoUsuarioDAO tipoUsuarioDAO;
	
	@Override
	public List<TipoUsuario> listAll() {
		return tipoUsuarioDAO.listAll();
	}


}
