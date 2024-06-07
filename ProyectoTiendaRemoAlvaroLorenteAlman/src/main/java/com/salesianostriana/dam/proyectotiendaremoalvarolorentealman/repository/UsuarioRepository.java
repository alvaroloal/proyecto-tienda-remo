package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findFirstByUsername(String username);
	Usuario findByUsername(String username);
	
	@Query("select u.id from Usuario u")
	public List<Long> obtenerIds();
	

	@Query("select u from Usuario u where TYPE(u) = Usuario")
	public List<Usuario> usuarioNoCliente();
	
	

}
