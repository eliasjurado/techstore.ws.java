package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.CompraCabecera;
import net.spring.concurso.entity.CompraDetalle;
import net.spring.concurso.entity.Producto;

public interface CompraDAO {
	public List<CompraDetalle> admlistAll();
	public List<CompraDetalle> listById(int id);
	public void saveCab(CompraCabecera bean);
	public void updateCab(CompraCabecera bean);
	public void saveDet(CompraDetalle bean);
}
