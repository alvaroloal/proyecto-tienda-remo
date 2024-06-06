package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.CategoriaService;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.ProductoService;


@Controller
@RequestMapping("/admin/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "admin/list-producto";
	}

	@GetMapping("/nuevo")
	public String nuevaProducto(Model model) {
		
		model.addAttribute("producto", new Producto());
		model.addAttribute("categorias", categoriaService.findAll());
		return "admin/form-producto";
	}

	@PostMapping("/nuevo/submit")
	public String submitNuevoProducto(Producto producto, Model model) {

		productoService.save(producto);
		return "redirect:/admin/producto/";

	}
	
	@GetMapping("/editar/{id}")
	public String editarProducto(@PathVariable("id") Long id, Model model) {

		Producto producto = productoService.findById(id);

		if (producto != null) {
			model.addAttribute("producto", producto);
			model.addAttribute("categorias", categoriaService.findAll());
			return "admin/form-producto";
		} else {
			return "redirect:/admin/producto/";
		}

	}
	
	@GetMapping("/borrar/{id}")
	public String borrarProducto(@PathVariable("id") Long id, Model model) {

		Producto producto = productoService.findById(id);

		if (producto != null) {
			productoService.delete(producto);
		}

		return "redirect:/admin/producto/";

	}
	
	@GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "admin/productos/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeNuevoProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "admin/productos/formulario";
    }

    @PostMapping
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        productoService.save(producto);
        return "redirect:/admin/productos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEditarProducto(@PathVariable Long id, Model model) {
        Producto producto = productoService.findById(id);
        model.addAttribute("producto", producto);
        return "admin/productos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/admin/productos";
    }

	

}
