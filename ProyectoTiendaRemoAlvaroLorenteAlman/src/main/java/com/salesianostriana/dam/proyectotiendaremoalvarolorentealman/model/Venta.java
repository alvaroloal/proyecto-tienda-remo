package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "venta")
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

	@ManyToOne
	@JoinColumn(name = "id")
	private Cliente cliente;

	@OneToMany(mappedBy = "venta")
	private List<LineaVenta> lineasVenta;

}
