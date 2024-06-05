package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/admin")
	public String index() {
		return "admin";
	}

}
