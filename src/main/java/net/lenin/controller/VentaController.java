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

import net.lenin.api.Venta;
import net.lenin.service.IVentaService;

@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	private IVentaService serviceVenta;
	
	@GetMapping("/ventas")
	public List<Venta> buscarTodos(){
		return serviceVenta.buscarTodos();
	}
	
	@PostMapping("/ventas")
	public Venta guardar(@RequestBody Venta venta) {
		serviceVenta.guardar(venta);
		return venta;
	}
	@PutMapping("/ventas")
	public Venta modificar(@RequestBody Venta venta) {
		serviceVenta.guardar(venta);
		return venta;
	}
	
	@DeleteMapping("/ventas/{id}")
	public String eliminar(@PathVariable("id") int idVenta) {
		serviceVenta.eliminar(idVenta);
		return "Registro Eliminado";
	}
	
}
