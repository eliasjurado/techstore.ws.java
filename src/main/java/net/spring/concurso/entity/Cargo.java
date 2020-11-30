package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Cargo")
public class Cargo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCargo")
	private int idcargo;
	@Column(name = "nomCargo")
	private String nomcargo;
	
	
	public int getIdcargo() {
		return idcargo;
	}
	public void setIdcargo(int idcargo) {
		this.idcargo = idcargo;
	}
	public String getNomcargo() {
		return nomcargo;
	}
	public void setNomcargo(String nomcargo) {
		this.nomcargo = nomcargo;
	}
	

	
}