package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Categoria;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ProductoRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.base.BaseServiceImpl;

@Service
public class ProductoService{
	
	@Autowired
	private ProductoRepository repositorioProducto;
	
	
	public List<Producto> findAll() {
		return repositorioProducto.findAll();
	}
	
	public List<Producto> findAllByCategoria(Categoria categoria) {
		return repositorioProducto.findByCategoria(categoria);
	}
	
	public List<Producto> findAllByCategoria(Long categoriaId) {
		return repositorioProducto.findByCategoriaId(categoriaId);
	}
	
	public Producto findById(Long id) {
		return repositorioProducto.findById(id).orElse(null);
	}
	
	public Producto save(Producto producto) {
		return repositorioProducto.save(producto);
	}
	
	public Producto delete(Producto producto) {
		Producto result = findById(producto.getId());
		repositorioProducto.delete(result);
		return result;
	}
	
	public int numeroProductosCategoria(Categoria categoria) {
		return repositorioProducto.findNumProductosByCategoria(categoria);
	}
	
	public List<Producto> obtenerProductosAleatorios(int numero) {
		// Obtenemos los ids de todos los productos
		List<Long> listaIds = repositorioProducto.obtenerIds();
		// Los desordenamos 
		Collections.shuffle(listaIds);
		// Nos quedamos con los N primeros, con N = numero
		listaIds = listaIds.stream().limit(numero).collect(Collectors.toList());
		// Buscamos los productos con esos IDs y devolvemos la lista
		return repositorioProducto.findAllById(listaIds);

	}
	
	  public void eliminarProducto(Long id) {
	        repositorioProducto.deleteById(id);
	    }
	
	

	
	

}
