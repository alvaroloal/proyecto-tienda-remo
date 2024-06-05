package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
