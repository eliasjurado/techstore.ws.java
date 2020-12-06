package net.spring.concurso.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Compra_Detalle")
public class CompraDetalle implements Serializable {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name = "idCompra")
	private CompraCabecera compra;
	@Column(name = "idProducto")
	private int idProducto;
	@Column(name = "cantidad")
	private int cantidad;
	public CompraCabecera getCompra() {
		return compra;
	}
	public void setCompra(CompraCabecera compra) {
		this.compra = compra;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
