package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
@NoRepositoryBean
public interface BaseUsuarioRepository <T extends Usuario>extends JpaRepository<T, Long>{
	public T findByUsername(String nombreUsuario);
}
