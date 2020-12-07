package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Distrito;

public interface DistritoService {
	public List<Distrito> listAll();
	public void save(Distrito bean);
	public void update(Distrito bean);
	public void delete(int cod);
}
