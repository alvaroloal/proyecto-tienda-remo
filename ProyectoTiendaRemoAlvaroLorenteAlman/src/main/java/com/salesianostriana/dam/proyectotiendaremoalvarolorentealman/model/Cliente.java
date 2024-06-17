package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;


import jakarta.persistence.Entity;
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
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String numeroTarjeta;
	private String email;
	
	
	
	
	

	/*
	 * cliente realiza muchas ventas
	 * */
	/*@OneToMany(mappedBy = "cliente")
	private List<Venta> ventas;*/
	

}