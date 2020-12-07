package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> listAll();
	public void save(Categoria bean);
	public void update(Categoria bean);
	public void delete(int cod);
}
