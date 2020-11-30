package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempleado")
	private int idempleado;
	@Column(name = "nomempleado")
	private String nomempleado;
	@Column(name = "apeempleado")
	private String apeempleado;	
	@Column(name = "dniempleado")
	private String dniempleado;	
	@Column(name = "tlfempleado")
	private String tlfempleado;
	@Column(name = "direcempleado")
	private String direcempleado;	
	@Column(name = "iddistrito")
	private int iddistrito;	
	@Column(name = "idcargo")
	private int idcargo;	
	@Column(name = "emailempleado")
	private String emailempleado;
	@Column(name = "passempleado")
	private String passempleado;
	@Column(name = "idtipousuario")
	private int idtipousuario;
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNomempleado() {
		return nomempleado;
	}
	public void setNomempleado(String nomempleado) {
		this.nomempleado = nomempleado;
	}
	public String getApeempleado() {
		return apeempleado;
	}
	public void setApeempleado(String apeempleado) {
		this.apeempleado = apeempleado;
	}
	public String getDniempleado() {
		return dniempleado;
	}
	public void setDniempleado(String dniempleado) {
		this.dniempleado = dniempleado;
	}
	public String getTlfempleado() {
		return tlfempleado;
	}
	public void setTlfempleado(String tlfempleado) {
		this.tlfempleado = tlfempleado;
	}
	public String getDirecempleado() {
		return direcempleado;
	}
	public void setDirecempleado(String direcempleado) {
		this.direcempleado = direcempleado;
	}
	public int getIddistrito() {
		return iddistrito;
	}
	public void setIddistrito(int iddistrito) {
		this.iddistrito = iddistrito;
	}
	public int getIdcargo() {
		return idcargo;
	}
	public void setIdcargo(int idcargo) {
		this.idcargo = idcargo;
	}
	public String getEmailempleado() {
		return emailempleado;
	}
	public void setEmailempleado(String emailempleado) {
		this.emailempleado = emailempleado;
	}
	public String getPassempleado() {
		return passempleado;
	}
	public void setPassempleado(String passempleado) {
		this.passempleado = passempleado;
	}
	public int getIdtipousuario() {
		return idtipousuario;
	}
	public void setIdtipousuario(int idtipousuario) {
		this.idtipousuario = idtipousuario;
	}
	
	
}