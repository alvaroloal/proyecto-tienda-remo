package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {


	@GetMapping({ "/" })
	public String inicio(Model model) {
		return "index";

	}
	
	@GetMapping("/admin")
	public String admin(Model model) {
		return "index-admin";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

}
