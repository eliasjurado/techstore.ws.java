package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="distrito")
public class Distrito implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddistrito")
	private int iddistrito;
	@Column(name = "nomdistrito")
	private String nomdistrito;
	
	public int getIddistrito() {
		return iddistrito;
	}
	public void setIddistrito(int iddistrito) {
		this.iddistrito = iddistrito;
	}
	public String getNomdistrito() {
		return nomdistrito;
	}
	public void setNomdistrito(String nomdistrito) {
		this.nomdistrito = nomdistrito;
	}
	
	
	
}