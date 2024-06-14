package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ManyToOne;

public class Venta {
	private Long id;
	
	//las ventas van asociadas a un usuario
	@ManyToOne
	private Usuario usuario;
	
	
	private LocalDateTime fechaPedido;
	
	private double importeTotal;
	
	private boolean finalizada;
	
	
	private List<LineaDeVenta> lineasVenta = new ArrayList<>();
	
	public void addLineaVenta(LineaDeVenta lv) {
		
		
	}
	
	

}
