package net.spring.concurso.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="producto")
public class Producto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto")
	private int idproducto;
	@Column(name = "desproducto")
	private String desproducto;
	@Column(name = "idcategoria")
	private int idcategoria;	
	@Column(name = "precioProducto")
	private double precioProducto;		
	@Column(name = "stock_act")
	private int stockact;		
	@Column(name = "stock_min")
	private int stockmin;
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getDesproducto() {
		return desproducto;
	}
	public void setDesproducto(String desproducto) {
		this.desproducto = desproducto;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getStockact() {
		return stockact;
	}
	public void setStockact(int stockact) {
		this.stockact = stockact;
	}
	public int getStockmin() {
		return stockmin;
	}
	public void setStockmin(int stockmin) {
		this.stockmin = stockmin;
	}		

	
}