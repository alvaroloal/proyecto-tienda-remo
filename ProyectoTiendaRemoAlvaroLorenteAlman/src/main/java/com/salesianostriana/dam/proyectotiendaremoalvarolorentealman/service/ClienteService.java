package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ClienteRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.base.BaseServiceImpl;

@Service
public class ClienteService extends BaseServiceImpl<Cliente, Long, ClienteRepository>{
	
	@Autowired
	ClienteRepository clienteRepositorio;
	
	
    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

    public Cliente obtenerClientePorId(Long id) {
        return clienteRepositorio.findById(id).orElse(null);
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepositorio.deleteById(id);
    }
    
    
    
    

 
}
