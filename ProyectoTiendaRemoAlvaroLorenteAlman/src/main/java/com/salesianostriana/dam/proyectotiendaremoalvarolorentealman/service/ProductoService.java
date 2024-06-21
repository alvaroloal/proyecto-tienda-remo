package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Categoria;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ProductoRepository;

@Service
public class ProductoService {

	private List<Producto> pedido = new ArrayList();
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
		List<Long> listaIds = repositorioProducto.obtenerIds();
		Collections.shuffle(listaIds);
		listaIds = listaIds.stream().limit(numero).collect(Collectors.toList());
		return repositorioProducto.findAllById(listaIds);

	}

	public void eliminarProducto(Long id) {
		repositorioProducto.deleteById(id);
	}

	public void aniadirProductoAlPedido(Producto p) {
		this.pedido.add(p);

	}

	public List<Producto> obtenerPedido() {
		return pedido;
	}

	public float obtenerTotalPedido() {
		float totalPedido = 0;
		for (Producto producto : this.pedido) {
			totalPedido += producto.getPvp() * (1 - producto.getDescuento());

		}
		return totalPedido;

	}

}
