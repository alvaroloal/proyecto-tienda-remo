package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.CategoriaService;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.ProductoService;

@Controller
public class MainController {

	private static final int NUM_PRODUCTOS_ALEATORIOS = 7;

	@Autowired
	private CategoriaService categoriaService;

	@Autowired
	private ProductoService productoService;

	@GetMapping({ "/" })
	public String inicio(Model model) {
		return "index";

	}
	
	@GetMapping("/categorias")
	public String index(@RequestParam(name="idCategoria", required=false) Long idCategoria, Model model) {		
		
		model.addAttribute("categorias", categoriaService.findAll());
		
		List<Producto> productos;
		
		if (idCategoria == null) {
			productos = productoService.obtenerProductosAleatorios(NUM_PRODUCTOS_ALEATORIOS);
		} else {			
			productos = productoService.findAllByCategoria(idCategoria);
		}
		
		model.addAttribute("productos", productos);
		
		return "index-productos";
	}
	
	
	
	@GetMapping("/product/{id}")
	public String showDetails(@PathVariable("id") Long id, Model model) {
		
		//buscar prod por id
		Producto p = productoService.findById(id);
		
		if (p != null) {
			model.addAttribute("producto", p);
			return "detail";
		}
		
		return "redirect:/";
		
	}

}
