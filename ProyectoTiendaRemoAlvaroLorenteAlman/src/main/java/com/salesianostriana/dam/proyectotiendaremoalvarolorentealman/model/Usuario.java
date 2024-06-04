package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // al insertar un registro el id se autoincrementa
	private Long id;
	
	private String nombreCompleto;
	private String nombreUsuario;
	private String email;
	private String contrasenia;
	private String telefono;
	private String tipo;

	@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;
	
	/**/
	@OneToMany(mappedBy = "usuario")
	private List<Venta> ventas;

	/*
	 * @Enumerated(EnumType.STRING) private UsuarioRol rol;
	 */

}
