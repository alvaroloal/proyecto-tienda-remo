package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@DiscriminatorValue("CLIENTE")
@Entity
@Data
//@NoArgsConstructor
public class Cliente extends Usuario {

	private String telefono;
	private String direccion;
	private String numeroTarjeta;
	private String email;

	public Cliente(String nombreCompleto, String nombreUsuario, String contrasenia) {
		super(nombreCompleto, nombreUsuario, contrasenia);
		this.telefono = telefono;
		this.direccion = direccion;
		this.numeroTarjeta = numeroTarjeta;
		this.email = email;
	}

}
