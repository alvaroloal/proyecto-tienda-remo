package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman;


import java.util.List;

import jakarta.annotation.PostConstruct;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {
	
	private final UsuarioRepository repositorioUsuario;
	private final PasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void init() {
		
		Usuario usuario = Usuario.builder()
				.admin(false)
				.username("user")
				//.password("1234")
				.password(passwordEncoder.encode("1234"))
				.build();
		
		Usuario admin = Usuario.builder()
				.admin(true)
				.username("admin")
				.password(passwordEncoder.encode("admin"))
				.build();
		
		repositorioUsuario.saveAll(List.of(usuario, admin));
		
	}

}
