package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	@Id
	@GeneratedValue
	private Long idProducto;

	private String nombre;

	private String descripcion;

	private float precio;
	
	//@Lob //mapear con la bbdd objeto pesado
	private String imagen;
	
	
	@ManyToOne
	@JoinColumn(name = "categoria", referencedColumnName = "id")
	private Categoria categoria;

	public Producto(String nombre, String descripcion, float precio, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	//metodo para calcular precio de un producto
	public double calcularPrecio(double ganancia) {
		return precio * ganancia/100;
	}
}
