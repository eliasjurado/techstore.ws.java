package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.CompraCabecera;
import net.spring.concurso.entity.CompraDetalle;

public interface CompraDAO {
	public List<CompraDetalle> admlistAll();
	public List<CompraDetalle> listById(int id);
}
