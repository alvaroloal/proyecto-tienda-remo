package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.CategoriaService;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.ProductoService;


@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	private static final int NUM_PRODUCTOS_ALEATORIOS = 8;

	@Autowired
	private CategoriaService categoriaService;

	
	@GetMapping("")
    public String listar(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "lista-producto";
    }

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "form-producto";
	}

	@GetMapping("/nuevo")
	public String nuevoProducto(Model model) {
		
		model.addAttribute("producto", new Producto());
		model.addAttribute("categorias", categoriaService.findAll());
		return "form-producto";
	}

	@PostMapping("/nuevo/submit")
	public String submitNuevoProducto(Producto producto, Model model) {

		productoService.save(producto);
		return "redirect:/producto";

	}
	
	@GetMapping("/editar/{id}")
	public String editarProducto(@PathVariable("id") Long id, Model model) {

		Producto producto = productoService.findById(id);

		if (producto != null) {
			model.addAttribute("producto", producto);
			model.addAttribute("categorias", categoriaService.findAll());
			return "form-producto";
		} else {
			return "redirect:/producto/";
		}

	}
	

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/producto";
    }
    
    
    @GetMapping("/ver/todos")
	public String indexProductos(@RequestParam(name="idCategoria", required=false) Long idCategoria, Model model) {		
		
		model.addAttribute("categorias", categoriaService.findAll());
		
		List<Producto> productos;
		
		if (idCategoria == null) {
			productos = productoService.obtenerProductosAleatorios(NUM_PRODUCTOS_ALEATORIOS);
		} else {			
			productos = productoService.findAllByCategoria(idCategoria);
		}
		
		model.addAttribute("productos", productos);
		model.addAttribute("articulos", productoService.obtenerPedido());
		return "index-productos";
	}
    
    @GetMapping("/ver/{id}")
	public String showDetails(@PathVariable("id") Long id, Model model) {
		
		Producto p = productoService.findById(id);
		
		if (p != null) {
			model.addAttribute("producto", p);
			return "detail";
		}
		
		return "redirect:/";
		
	}
	
	@GetMapping("/pedido/aniadir/{id}")
	public String aniadirProductos(@PathVariable("id") Long id, Model model) {
		
		Producto p = productoService.findById(id);
		
		productoService.aniadirProductoAlPedido(p);
		
		
		return "redirect:/producto/ver/todos";
		
	}
	
	@GetMapping("/pedido/ver")
	public String verPedido(Model model) {
		model.addAttribute("pedido",productoService.obtenerPedido());
		model.addAttribute("total", productoService.obtenerTotalPedido());
		return "lista-pedido";
	}
	

	

}
    
  

	


