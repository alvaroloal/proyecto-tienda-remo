package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Venta {
	
	@Id
	@GeneratedValue
	private Long id;
	
	//las ventas van asociadas a un usuario
	@ManyToOne
	private Usuario usuario;
	
	
	private LocalDateTime fechaPedido;
	
	private double importeTotal;
	
	private boolean finalizada;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="venta", 
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<LineaDeVenta> lineasDeVenta = new ArrayList<>();

	
	
	
	public void addLineaDeVenta(LineaDeVenta lv) {
		lv.setVenta(this);
		this.lineasDeVenta.add(lv);
		
		
	}
	
	public void eliminarLineaDeVenta(LineaDeVenta lv) {
		this.lineasDeVenta.remove(lv);
		//lv.setVenta(null);
	}
	
	
	
	

}
