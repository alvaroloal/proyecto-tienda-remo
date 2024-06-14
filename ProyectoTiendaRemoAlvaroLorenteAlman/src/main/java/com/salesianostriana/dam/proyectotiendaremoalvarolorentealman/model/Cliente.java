package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;


import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
public class Cliente extends Usuario {

	private String telefono;
	private String direccion;
	private String numeroTarjeta;
	private String email;
	
	public Cliente(String nombreCompleto, String username, String contrasenia, boolean esAdmin, String telefono,
			String direccion, String numeroTarjeta, String email) {
		this.telefono = telefono;
		this.direccion = direccion;
		this.numeroTarjeta = numeroTarjeta;
		this.email = email;
	}
	
	
	/*
	 * cliente realiza muchas ventas
	 * */
	/*@OneToMany(mappedBy = "cliente")
	private List<Venta> ventas;*/
	

}
