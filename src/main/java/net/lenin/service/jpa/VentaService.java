package net.lenin.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.lenin.api.Venta;
import net.lenin.repository.VentaRepository;
import net.lenin.service.IVentaService;

@Service
public class VentaService implements IVentaService {
	
	@Autowired
	private VentaRepository repoVenta;

	@Override
	public List<Venta> buscarTodos() {
	
		return repoVenta.findAll();
	}

	@Override
	public void guardar(Venta venta) {
		repoVenta.save(venta);
		
	}

	@Override
	public void eliminar(int idVenta) {
		repoVenta.deleteById(idVenta);
		
	}

}
