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
@RequestMapping("/productos")
public class ProductoController {
/* /productos
				GET 	/ 				Ver todos
				GET		/nuevo			Muestra formulario producto
				POST	/nuevo			Envia formulario - redirije a productos
				GET		/editar/{id}	Muestra formulario producto
				GET		/borrar/{id}	Borra producto con id - redirije a productos
 */

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "admin/productos/lista";
    }

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "admin/list-producto";
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
		return "redirect:/productos/";

	}
	
	@GetMapping("/editar/{id}")
	public String editarProducto(@PathVariable("id") Long id, Model model) {

		Producto producto = productoService.findById(id);

		if (producto != null) {
			model.addAttribute("producto", producto);
			model.addAttribute("categorias", categoriaService.findAll());
			return "/form-producto";
		} else {
			return "redirect:/productos/";
		}

	}
	
	@GetMapping("/borrar/{id}")
	public String borrarProducto(@PathVariable("id") Long id, Model model) {

		Producto producto = productoService.findById(id);

		if (producto != null) {
			productoService.delete(producto);
		}

		return "redirect:/productos/";

	}
	

    @GetMapping("/nuevoProducto")
    public String mostrarFormularioDeNuevoProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "admin/productos/formulario";
    }

    @PostMapping
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        productoService.save(producto);
        return "redirect:/admin/productos";
    }

    @GetMapping("/editarForm/{id}")
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
    
    
    /*
    @GetMapping("/editar/{id_usuario}/{id_producto}")
	public String editarProducto(@PathVariable("id_usuario") Long id_usuario, @PathVariable("id_producto") Long id_producto,  Model model) {

		Producto producto = productoService.findById(id_producto);
		//comprobar en la bbd si el usuario que esta intennato aditar es admin o no
		
		//buscar el usuario en la bbdd y devuelve si es administardo o no
		//en el servicio  de usuario
		//boolean esAdmin = usuarioService.isAdmin
				
				
		// id del usuario y el id del producto
		//comprobar que es admin 
		//si el producto existe y es admin 
		if (producto != null) {
			model.addAttribute("producto", producto);
			model.addAttribute("categorias", categoriaService.findAll());
			//añadir el servicio si es admin o no
			//model.addAttribute("esAdmin", esAdmin);

			return "admin/form-producto";
		} else {
			return "redirect:/producto/";
		}

	}*/

	


