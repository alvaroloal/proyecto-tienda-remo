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

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.UsuarioService;
/*
 * crud completo 
 * 
 * */
@Controller
@RequestMapping("/admin/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	//////
	@GetMapping
	public List<Usuario> obtenerUsuarios(){
		return this.obtenerUsuarios();
	}
	
	@PostMapping
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		 /*return this.guardarUsuario(usuario);*/
		return this.usuarioService.save(usuario); 
	 }
	
	
	@GetMapping(path="/{id}")
	public Optional<Usuario> getUsuarioById(@PathVariable("id")Long id){
		return this.usuarioService.obtenerById(id);
		
		
	}
	
	@PutMapping(path="/{id}")
	public Usuario actualizarUsuarioPorId(@RequestBody Usuario request,@PathVariable("id")Long id) {
		return this.usuarioService.actualizarPorId(request, id);
	}
	
	
	@DeleteMapping(path= "/{id}")
	public String deleteById(@PathVariable("id")Long id) {
		boolean ok = this.usuarioService.borrarUsuario(id);
		if(ok) {
			
			return "usuario con id "+ id+ " borrado";
		}else {
			return "Error, no se puede borrar el usuario co id"+id;
		}
		
	}
	
	
	////

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
		Optional<Usuario> usuario = usuarioService.findById(id);

		if (usuario != null) {
			model.addAttribute("usuario", usuario);
			return "admin/form-usuario";
		} else {
			return "redirect:/admin/usuario/";
		}
	}

	@PostMapping("editar/submit")
	/* public String guardarUsuarioEditado(Usuario usuario, ) {} */

	@GetMapping("/borrar/{id}")
	public String borrarUsuario(@PathVariable("id") Long id, Model model) {

		Optional<Usuario> usuario = usuarioService.findById(id);
				
		if (usuario != null) {
			usuarioService.borrarUsuario(id);
		}
		return "redirect:/admin/usuario";

	}

}
