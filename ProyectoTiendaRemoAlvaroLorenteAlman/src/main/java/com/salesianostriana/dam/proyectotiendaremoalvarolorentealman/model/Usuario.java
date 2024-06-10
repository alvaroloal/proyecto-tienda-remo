package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // al insertar un registro el id se autoincrementa
	private Long id;
	
	private String nombreCompleto;
	private String username;
	private String contrasenia;
	private boolean esAdmin;
	
	/*@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;s
	
	@OneToMany(mappedBy = "usuario")
	private List<Venta> ventas;*/
	
	public Usuario(String nombreCompleto, String username, String contrasenia, boolean esAdmin) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.username = username;
		this.contrasenia = contrasenia;
		this.esAdmin = esAdmin;
	}
	
	
	
	
}
