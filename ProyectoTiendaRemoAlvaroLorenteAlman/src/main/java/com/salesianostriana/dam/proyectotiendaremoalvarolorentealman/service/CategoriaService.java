package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Categoria;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.CategoriaRepository;

@Service
public class CategoriaService{
	
	@Autowired
	private CategoriaRepository repositorioCategoria;
	
	public List<Categoria> findAll() {
		return repositorioCategoria.findAll();
	}	
	
	public List<Categoria> findDestacadas() {
		return repositorioCategoria.findDestacadas();
	}
	
	public Categoria save(Categoria categoria) {
		return repositorioCategoria.save(categoria);
	}
	
	public Categoria findById(Long id) {
		return repositorioCategoria.findById(id).orElse(null);
	}
	
	public Categoria delete(Categoria categoria) {
		Categoria result = findById(categoria.getId());
		repositorioCategoria.delete(result);
		return result;
	}

}
