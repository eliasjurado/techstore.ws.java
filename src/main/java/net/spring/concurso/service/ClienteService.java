package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Cliente;

public interface ClienteService {
	public List<Cliente> listAll();
	public Cliente loginCliente(String email, String pass);
	public void save(Cliente bean);
	public void update(Cliente bean);
	public void delete(int cod);
}
