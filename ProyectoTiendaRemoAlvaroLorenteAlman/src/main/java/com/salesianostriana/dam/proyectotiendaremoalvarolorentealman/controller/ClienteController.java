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

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @GetMapping({"/","/list"})
    public String listar(Model model) {
        model.addAttribute("lista", clienteService.listarClientes());
        return "list-cliente";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeNuevoCliente(Model model) {
    	//al generar el id da error
    	/*
    	List<Cliente> listaClientes =clienteService.listarClientes();
    	//al id de los clientes que hay en la listaClientes le suma 1
    	int id=listaClientes.size()+1;
    	
    	Cliente cliente = new Cliente();
    	cliente.setId((long) id);*/
        model.addAttribute("cliente", new Cliente());
        return "form-crear-cliente";
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
        return "form-editar-cliente";
    }
    
    @PostMapping("/editar/submit")
	public String procesarFormularioEdicion(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.edit(cliente);
		return "redirect:/";
		
	}
    
    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return "redirect:/cliente/list";
    }
}

