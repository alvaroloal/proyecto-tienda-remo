package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.UsuarioService;

@Controller
@RequestMapping("/admin/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public String index(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "admin/list-usuario";
	}
	
	@GetMapping("/nuevo")
	public String nuevoUsuario(Model model) {
		model.addAttribute("producto", new Usuario());
		return "admin/form-usuario";
	}
	
	@PostMapping("/nuevo/submit")
	public String submitNuevoUsuario(Usuario usuario, Model model) {
		usuarioService.save(usuario);
		return "redirect:/admin/producto/";
	}
	
	

}
