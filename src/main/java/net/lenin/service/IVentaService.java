package net.lenin.service;

import java.util.List;

import net.lenin.api.Venta;

public interface IVentaService {
	List<Venta> buscarTodos();
	void guardar(Venta venta);
	void eliminar(int idVenta);
}
