package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	private int idcliente;
	@Column(name = "nomcliente")
	private String nomcliente;
	@Column(name = "apecliente")
	private String apecliente;	
	@Column(name = "dnicliente")
	private String dnicliente;	
	@Column(name = "tlfcliente")
	private String tlfcliente;
	@Column(name = "direccliente")
	private String direccliente;	
	@Column(name = "iddistrito")
	private int iddistrito;	
	@Column(name = "emailcliente")
	private String emailcliente;
	@Column(name = "passcliente")
	private String passcliente;
	@Column(name = "idtipousuario")
	private int idtipousuario;
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNomcliente() {
		return nomcliente;
	}
	public void setNomcliente(String nomcliente) {
		this.nomcliente = nomcliente;
	}
	public String getApecliente() {
		return apecliente;
	}
	public void setApecliente(String apecliente) {
		this.apecliente = apecliente;
	}
	public String getDnicliente() {
		return dnicliente;
	}
	public void setDnicliente(String dnicliente) {
		this.dnicliente = dnicliente;
	}
	public String getTlfcliente() {
		return tlfcliente;
	}
	public void setTlfcliente(String tlfcliente) {
		this.tlfcliente = tlfcliente;
	}
	public String getDireccliente() {
		return direccliente;
	}
	public void setDireccliente(String direccliente) {
		this.direccliente = direccliente;
	}
	public int getIddistrito() {
		return iddistrito;
	}
	public void setIddistrito(int iddistrito) {
		this.iddistrito = iddistrito;
	}
	public String getEmailcliente() {
		return emailcliente;
	}
	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}
	public String getPasscliente() {
		return passcliente;
	}
	public void setPasscliente(String passcliente) {
		this.passcliente = passcliente;
	}
	public int getIdtipousuario() {
		return idtipousuario;
	}
	public void setIdtipousuario(int idtipousuario) {
		this.idtipousuario = idtipousuario;
	}	
	
}