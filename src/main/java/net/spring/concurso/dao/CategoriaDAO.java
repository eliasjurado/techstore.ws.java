package net.spring.concurso.dao;
import java.util.List;

import net.spring.concurso.entity.Categoria;

public interface CategoriaDAO {
	public List<Categoria> listAll();
	public void save(Categoria bean);
	public void update(Categoria bean);
	public void delete(int cod);
}