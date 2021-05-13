package net.lenin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.lenin.api.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	
}
