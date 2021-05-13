package net.lenin.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.lenin.api.Producto;
import net.lenin.repository.ProductoRepository;
import net.lenin.service.IProductoService;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository repoProducto;
	
	@Override
	public List<Producto> buscarTodos() {
		
		return repoProducto.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		repoProducto.save(producto);
		
	}

	@Override
	public void eliminar(int idProducto) {
		repoProducto.deleteById(idProducto);		
	}

}
