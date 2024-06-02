package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByUsername(String nombreUsuario);

	boolean existsByUsername(String nombreUsuario);
}
