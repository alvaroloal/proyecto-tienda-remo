package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.UsuarioService;

@Controller
@RequestMapping("/admin/usuario")
public class UsuarioController {
	@Autowired
    private UsuarioService usuarioService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "admin/list-usuario";
	}
	@GetMapping("/nuevo")
	public String nuevoUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		
		return "admin/form-usuario";
	}
	
	
	@PostMapping("/nuevo/submit")
	public String guardarNuevoUsuario(Usuario usuario, Model model) {
		usuarioService.save(usuario);
		return "redirect:/admin/usuario";

	}
	
	@GetMapping("/editar/{id}")
	public String editarUsuario(@PathVariable("id") Long id, Model model) {
		Usuario usuario = usuarioService.findById(id);
		
		if (usuario != null) {
			model.addAttribute("usuario", usuario);
			return "admin/form-usuario";
		} else {
			return "redirect:/admin/usuario/";
		}
	}
	
	
	@GetMapping("/borrar/{id}")
	public String borrarUsuario(@PathVariable("id")Long id, Model model) {
		
		Usuario usuario = usuarioService.findById(id);
		
		if(usuario != null) {
			usuarioService.delete(usuario);
		}
		return "redirect:/admin/usuario";
		
	}
	
	
    
 

}
