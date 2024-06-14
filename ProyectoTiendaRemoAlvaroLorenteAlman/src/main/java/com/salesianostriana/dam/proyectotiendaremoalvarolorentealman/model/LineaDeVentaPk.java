package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineaDeVentaPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Venta venta;
}
