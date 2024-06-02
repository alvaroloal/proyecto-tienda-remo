package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Cliente extends Usuario{
	
	public Cliente(String nombreCompleto, String nombreUsuario, String contrasenia) {
		super(nombreCompleto, nombreUsuario, contrasenia);
		
	}

}
