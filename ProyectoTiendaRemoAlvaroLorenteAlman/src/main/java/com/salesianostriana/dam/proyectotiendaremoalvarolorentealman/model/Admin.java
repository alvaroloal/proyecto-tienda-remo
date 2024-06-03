package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@DiscriminatorValue("ADMIN")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
//@NoArgsConstructor
public class Admin extends Usuario {

	public Admin(String nombreCompleto, String nombreUsuario, String contrasenia) {
		super(nombreCompleto, nombreUsuario, contrasenia);
	}

}
