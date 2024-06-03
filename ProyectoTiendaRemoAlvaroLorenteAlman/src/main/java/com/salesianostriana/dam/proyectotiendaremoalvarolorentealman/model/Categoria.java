package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="categoria") @Data @NoArgsConstructor @AllArgsConstructor
public class Categoria {

	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String imagen;
}