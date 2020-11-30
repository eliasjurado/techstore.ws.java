package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria")
	private int idcategoria;
	@Column(name = "nomcategoria")
	private String nomcategoria;
	
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNomcategoria() {
		return nomcategoria;
	}
	public void setNomcategoria(String nomcategoria) {
		this.nomcategoria = nomcategoria;
	}
	
	


	
}