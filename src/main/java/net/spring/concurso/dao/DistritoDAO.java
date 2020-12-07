package net.spring.concurso.dao;
import java.util.List;

import net.spring.concurso.entity.Distrito;

public interface DistritoDAO {
	public List<Distrito> listAll();
	public void save(Distrito bean);
	public void update(Distrito bean);
	public void delete(int cod);
}