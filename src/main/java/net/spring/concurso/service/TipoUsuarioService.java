package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Producto;
import net.spring.concurso.entity.TipoUsuario;

public interface TipoUsuarioService {
	public List<TipoUsuario> listAll();
	public void save(TipoUsuario bean);
	public void update(TipoUsuario bean);
	public void delete(int cod);
}
