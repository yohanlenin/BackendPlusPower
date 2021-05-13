package net.lenin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.lenin.api.Producto;
import net.lenin.service.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	private IProductoService serviceProducto;
	
	@GetMapping("/productos")
	public List<Producto> buscarTodos(){
		
		return serviceProducto.buscarTodos();
	}
	
	@PostMapping("/productos")
	public Producto guardar(@RequestBody Producto producto) {
		
		serviceProducto.guardar(producto);
		return producto;
	}
	@PutMapping("/productos")
	public Producto modificar(@RequestBody Producto producto) {
		
		serviceProducto.guardar(producto);
		return producto;
	}
	
	@DeleteMapping("/productos/{id}")
	public String eliminar(@PathVariable("id") int idProducto) {
		serviceProducto.eliminar(idProducto);
		
		return "Registro Eliminado";
	}
	

}
