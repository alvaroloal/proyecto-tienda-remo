package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineaVenta {
	private Long id;
	private Long cantidad;
	private float subtotal;
	
	@ManyToOne
	private Producto producto;
	
	
	
}
