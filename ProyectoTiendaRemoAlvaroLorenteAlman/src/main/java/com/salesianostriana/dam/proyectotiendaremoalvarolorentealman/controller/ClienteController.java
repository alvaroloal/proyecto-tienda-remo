package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    /*
    @GetMapping({"/", "/list"})
    public String listar(Model model) {
        model.addAttribute("clientes", clienteService.listarClientes());
        return "nuevo-cliente";
    }*/

    @GetMapping("/nuevo")
    public String mostrarFormularioDeNuevoCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "formulario-cliente";
    }

    @PostMapping("/nuevo/submit")
    public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
        clienteService.guardarCliente(cliente);
        return "redirect:/";
    }
    

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEditarCliente(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.obtenerClientePorId(id);
        model.addAttribute("cliente", cliente);
        return "formulario-cliente";
    }
    
    @PostMapping("/editar/submit")
	public String procesarFormularioEdicion(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.edit(cliente);
		return "redirect:/";
		
	}
    
    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return "redirect:/";
    }
}

