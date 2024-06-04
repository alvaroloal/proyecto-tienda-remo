package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data @NoArgsConstructor @AllArgsConstructor
public class Categoria {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private boolean destacada;
	
	private String imagen;

	public Categoria(String nombre, boolean destacada, String imagen) {
		this.nombre = nombre;
		this.destacada = destacada;
		this.imagen = imagen;
	}
	

}
