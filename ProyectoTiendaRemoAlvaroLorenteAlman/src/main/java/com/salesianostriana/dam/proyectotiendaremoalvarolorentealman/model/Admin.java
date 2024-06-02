package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Admin extends Usuario {

	public Admin(String nombreCompleto, String nombreUsuario, String contrasenia) {
		super(nombreCompleto, nombreUsuario, contrasenia);
	}

}
