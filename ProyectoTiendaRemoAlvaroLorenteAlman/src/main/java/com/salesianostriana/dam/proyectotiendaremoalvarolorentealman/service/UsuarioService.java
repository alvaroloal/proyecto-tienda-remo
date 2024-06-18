package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.base.BaseServiceImpl;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorioUsuario;

	public List<Usuario> findAll() {
		return repositorioUsuario.findAll();
	}

	public Usuario findById(Long id) {
		return repositorioUsuario.findById(id).orElse(null);

	}

	public Usuario save(Usuario usuario) {
		return repositorioUsuario.save(usuario);

	}

	public Usuario delete(Usuario usuario) {
		Usuario resultado = findById(usuario.getId());
		repositorioUsuario.delete(resultado);
		return resultado;
	}

	public void eliminarUsuario(Long id) {
		repositorioUsuario.deleteById(id);
	}
	
	

	

}
