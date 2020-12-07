package net.spring.concurso.dao;
import java.util.List;

import net.spring.concurso.entity.TipoUsuario;

public interface TipoUsuarioDAO {
	public List<TipoUsuario> listAll();
	public void save(TipoUsuario bean);
	public void update(TipoUsuario bean);
	public void delete(int cod);
}