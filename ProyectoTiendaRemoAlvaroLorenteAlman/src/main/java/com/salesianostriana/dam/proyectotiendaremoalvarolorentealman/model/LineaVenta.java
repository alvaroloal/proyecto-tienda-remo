package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="lineasVenta")
@NoArgsConstructor
@AllArgsConstructor
public class LineaVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long cantidad;
	private float subtotal;
	
	@ManyToOne
	private Producto producto;
	
	
	
}
