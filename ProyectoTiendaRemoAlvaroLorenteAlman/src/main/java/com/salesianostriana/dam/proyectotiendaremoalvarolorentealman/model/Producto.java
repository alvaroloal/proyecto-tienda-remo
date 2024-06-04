package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Producto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	/*
	 * JPA nos permite mediante la anotación @Lob 
	 * mapear con la base de datos objetos pesados, 
	 * como podría ser imágenes, xml, binarios, cadenas de texto extensas, 
	 * json, etc. 
	 * Cualquier objeto que pueda tener un tamaño muy grande 
	 * o de longitud indefinida.
	 * En este caso quizá no haría falta ponerlo a la descrpción pero
	 * puede que haya algunas con muchos caracteres.
	 * */
	
	@Lob 
	private String descripcion;
	
	private float pvp;
	
	private float descuento;
	
	private String imagen;
	
	@ManyToOne
	private Categoria categoria;
	
	@OneToMany(mappedBy="producto", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private Set<Puntuacion> puntuaciones = new HashSet<Puntuacion>();

	public Producto(String nombre, String descripcion, float pvp, float descuento, String imagen, Categoria categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.descuento = descuento;
		this.imagen = imagen;
		this.categoria = categoria;
	}

	
	/**
	 * Métodos helper, aunque en este caso no se gestionan las puntuaciones
	 */
	public void addPuntuacion(Puntuacion puntuacion) {
		this.puntuaciones.add(puntuacion);
		puntuacion.setProducto(this);
	}
	
	/**
	 * Para calcular la media de puntuación. 
	 * Comprobamos que no sea cero
	 * Se utiliza Stream en el que:
	 * this.puntuaciones.stream()	Sacamos un stream con las puntuaciones
	 * .mapToInt(Puntuacion::getPuntuacion)	Creamos un Stream de enteros, es 
	 * lo que devuelve mapToInt, con el valor "puntuación" de cada elemento
	 * .average()	Calcula la media
	 * .getAsDouble();		Pasamos el resultado a double para ver la media con decimales
	 * */
	
	public double getPuntuacionMedia() {
		if (this.puntuaciones.isEmpty())
			return 0;
		else 
			return this.puntuaciones.stream()
					.mapToInt(Puntuacion::getPuntuacion)
					.average()
					.getAsDouble();
	}
	
	public double getNumeroTotalPuntuaciones() {
		return this.puntuaciones.size();
	}
	

}