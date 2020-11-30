package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Tipo_Usuario")
public class TipoUsuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtipousuario")
	private int idtipousuario;
	@Column(name = "nomtipousuario")
	private String nomtipousuario;
	public int getIdtipousuario() {
		return idtipousuario;
	}
	public void setIdtipousuario(int idtipousuario) {
		this.idtipousuario = idtipousuario;
	}
	public String getNomtipousuario() {
		return nomtipousuario;
	}
	public void setNomtipousuario(String nomtipousuario) {
		this.nomtipousuario = nomtipousuario;
	}
}