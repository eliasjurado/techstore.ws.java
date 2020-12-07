package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Cargo;
import net.spring.concurso.entity.CompraCabecera;
import net.spring.concurso.entity.CompraDetalle;

public interface CompraService {
	public List<CompraDetalle> admlistAll();
	public List<CompraDetalle> listById(int id);
	public void saveCab(CompraCabecera bean);
	public void updateCab(CompraCabecera bean);
	public void saveDet(CompraDetalle bean);
}
