package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Optional<Cliente> findById(Long id);
	Optional <Cliente> findByUsername(String username);

}
