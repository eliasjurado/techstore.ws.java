package net.spring.concurso.dao;
import java.util.List;
import net.spring.concurso.entity.Cliente;

public interface ClienteDAO {
	public List<Cliente> listAll();
}