package net.lenin.service;

import java.util.List;

import net.lenin.api.Producto;

public interface IProductoService {
	List<Producto> buscarTodos();
	void guardar(Producto producto);
	void eliminar(int idProducto);
}
