package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Cargo;

public interface CargoService {
	public List<Cargo> listAll();
	public void save(Cargo bean);
	public void update(Cargo bean);
	public void delete(int cod);
}
