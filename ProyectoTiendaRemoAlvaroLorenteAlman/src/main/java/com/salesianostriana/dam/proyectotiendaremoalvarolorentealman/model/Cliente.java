package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="clientes")
public class Cliente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String telefono;
	private String direccion;
	private String numeroTarjeta;
	private String email;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String telefono, String direccion, String numeroTarjeta, String email) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.numeroTarjeta = numeroTarjeta;
		this.email = email;
	}
	
	

}
