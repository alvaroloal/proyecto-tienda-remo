package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuarios/login";
    }

}
