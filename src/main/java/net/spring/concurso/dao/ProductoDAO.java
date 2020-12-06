package net.spring.concurso.dao;
import java.util.List;
import net.spring.concurso.entity.Producto;

public interface ProductoDAO {
	public List<Producto> listAll();
	public List<Producto> admListAll();
	public List<Producto> listById(int id);
}