package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Usuario{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // al insertar un registro el id se autoincrementa
	private Long id;
	
	private String username;
	private String contrasenia;
	private boolean admin;
	
	/*@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;
	
	
	@OneToMany(mappedBy = "usuario")
	private List<Venta> ventas;*/
}
