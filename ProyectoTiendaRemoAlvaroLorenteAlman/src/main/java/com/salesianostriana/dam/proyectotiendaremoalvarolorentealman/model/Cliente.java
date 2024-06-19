package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Cliente extends Usuario {

	
	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String apellidos;

	@Column(nullable = false)
	private String telefono;

	@Column(nullable = false)
	private String direccion;

	@Column(nullable = false)
	private String numeroTarjeta;

	@Column(nullable = false)
	private String email;
	
	public Cliente(String username, String password, String nombre, String apellidos, String telefono, String direccion, String numeroTarjeta, String email) {
		super(username, password, false);
		this.nombre = nombre;
		this.apellidos = apellidos;
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