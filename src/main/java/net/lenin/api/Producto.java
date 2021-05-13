package net.lenin.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idProducto;
	
	private String nombrePro;
	private int costoPro;
	private int precioPro;
	private int stock;
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombrePro() {
		return nombrePro;
	}
	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}
	public int getCostoPro() {
		return costoPro;
	}
	public void setCostoPro(int costoPro) {
		this.costoPro = costoPro;
	}
	public int getPrecioPro() {
		return precioPro;
	}
	public void setPrecioPro(int precioPro) {
		this.precioPro = precioPro;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombrePro=" + nombrePro + ", costoPro=" + costoPro
				+ ", precioPro=" + precioPro + ", stock=" + stock + "]";
	}
	
	

}
