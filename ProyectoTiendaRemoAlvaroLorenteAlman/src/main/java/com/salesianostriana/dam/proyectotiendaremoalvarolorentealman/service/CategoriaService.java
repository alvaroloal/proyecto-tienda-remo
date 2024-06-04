package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Categoria;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.CategoriaRepository;

@Service
public class CategoriaService{
	
	@Autowired
	private CategoriaRepository repositorio;
	
	public List<Categoria> findAll() {
		return repositorio.findAll();
	}	
	
	public List<Categoria> findDestacadas() {
		return repositorio.findDestacadas();
	}
	
	public Categoria save(Categoria categoria) {
		return repositorio.save(categoria);
	}
	
	public Categoria findById(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Categoria delete(Categoria categoria) {
		Categoria result = findById(categoria.getId());
		repositorio.delete(result);
		return result;
	}

}
