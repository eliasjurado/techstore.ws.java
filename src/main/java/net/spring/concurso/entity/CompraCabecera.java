package net.spring.concurso.entity;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="Compra_Cabecera")
public class CompraCabecera implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCompra")
	private int idCompra;
	@Column(name = "idCliente")
	private int idCliente;
	@Column(name = "fec_ped_comp")
	private Date fec_ped_comp;
	@Column(name = "fec_ent_comp")
	private Date fec_ent_comp;
	@Column(name = "est_comp")
	private int est_comp;
	
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFec_ped_comp() {
		return fec_ped_comp;
	}
	public void setFec_ped_comp(Date fec_ped_comp) {
		this.fec_ped_comp = fec_ped_comp;
	}
	public Date getFec_ent_comp() {
		return fec_ent_comp;
	}
	public void setFec_ent_comp(Date fec_ent_comp) {
		this.fec_ent_comp = fec_ent_comp;
	}
	public int getEst_comp() {
		return est_comp;
	}
	public void setEst_comp(int est_comp) {
		this.est_comp = est_comp;
	}

}
