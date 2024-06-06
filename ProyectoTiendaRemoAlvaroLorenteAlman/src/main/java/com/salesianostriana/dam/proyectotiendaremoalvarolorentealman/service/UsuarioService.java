package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ClienteRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.base.BaseServiceImpl;
@Service
public class UsuarioService extends BaseServiceImpl<Usuario, Long, UsuarioRepository>{
	@Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    /*public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }*/
}
