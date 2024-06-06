package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Cliente extends Usuario {

	private String telefono;
	private String direccion;
	private String numeroTarjeta;
	private String email;
	/*
	 * cliente realiza muchas ventas
	 * */
	/*@OneToMany(mappedBy = "cliente")
	private List<Venta> ventas;*/

	public Cliente(String nombreCompleto, String username, String contrasenia, String rol, String telefono,
			String direccion, String numeroTarjeta, String email) {
		super(nombreCompleto, username, contrasenia, rol);
		this.telefono = telefono;
		this.direccion = direccion;
		this.numeroTarjeta = numeroTarjeta;
		this.email = email;
	}

}
