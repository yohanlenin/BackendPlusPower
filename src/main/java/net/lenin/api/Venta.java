package net.lenin.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;
	
	private Date fechaRadicacion;
	private Date fechaAprovacion;
	private int descuento;
	private int totalVenta;
	private int idUsuario;
	
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getFechaRadicacion() {
		return fechaRadicacion;
	}
	public void setFechaRadicacion(Date fechaRadicacion) {
		this.fechaRadicacion = fechaRadicacion;
	}
	public Date getFechaAprovacion() {
		return fechaAprovacion;
	}
	public void setFechaAprovacion(Date fechaAprovacion) {
		this.fechaAprovacion = fechaAprovacion;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public int getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
	}
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", idUsuario=" + idUsuario + ", fechaRadicacion=" + fechaRadicacion
				+ ", fechaAprovacion=" + fechaAprovacion + ", descuento=" + descuento + ", totalVenta=" + totalVenta
				+ "]";
	}
	
	
}
