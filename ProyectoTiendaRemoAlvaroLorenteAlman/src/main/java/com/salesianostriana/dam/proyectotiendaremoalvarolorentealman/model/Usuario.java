package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
@Data
@Entity(name="usuarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//entidad base para una herencia
public abstract class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombreCompleto;
	private String nombreUsuario;
	private String contrasenia;
	
	public Usuario(String nombreCompleto, String nombreUsuario, String contrasenia) {
		this.nombreCompleto = nombreCompleto;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
	}
	
}
