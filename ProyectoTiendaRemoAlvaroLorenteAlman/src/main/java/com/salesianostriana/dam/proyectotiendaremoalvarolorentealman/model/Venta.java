package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ventas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate fechaVenta;
	private LocalDate fechaRecibida;
	
	private float total;
	
	@ManyToOne
	private Usuario usuario;
	
	
	
	
	

}
