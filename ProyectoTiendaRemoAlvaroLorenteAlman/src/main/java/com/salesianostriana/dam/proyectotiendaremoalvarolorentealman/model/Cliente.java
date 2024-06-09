package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
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
@NoArgsConstructor
@Entity
/*@PrimaryKeyJoinColumn(referencedColumnName="id")*/
public class Cliente extends Usuario {

	private String telefono;
	private String direccion;
	private String numeroTarjeta;
	private String email;
	
	public Cliente(String nombreCompleto, String username, String contrasenia, boolean esAdmin, String telefono,
			String direccion, String numeroTarjeta, String email) {
		super(nombreCompleto, username, contrasenia, esAdmin);
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
