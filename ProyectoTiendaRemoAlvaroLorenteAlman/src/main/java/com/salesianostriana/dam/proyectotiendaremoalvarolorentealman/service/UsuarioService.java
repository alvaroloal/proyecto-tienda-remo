package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ClienteRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.base.BaseServiceImpl;
@Service
public class UsuarioService /*extends BaseServiceImpl<Usuario, Long, UsuarioRepository>*/{
	@Autowired
    private UsuarioRepository usuarioRepository;
	
	
	public List <Usuario> findAll(){
		return usuarioRepository.findAll();
		
	}
	
	public Usuario findById(Long id) {
		return usuarioRepository.findById(id).orElse(null);
		
	}
	
    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    public Usuario delete(Usuario usuario) {
    	Usuario resultado = findById(usuario.getId());
    	usuarioRepository.delete(resultado);
    	return resultado;
    	
    }
    
   public List<Usuario> usuarioAleatorio(int usuariosAleatorios){
	   //lista de todos los usuarios
	   List <Long> listaIds = usuarioRepository.obtenerIds();
	   
	   Collections.shuffle(listaIds);
	   
	   listaIds= listaIds.stream()
			   			.limit(usuariosAleatorios)
			   			.collect(Collectors.toList());
	   return usuarioRepository.findAllById(listaIds);
	   
	   
   }
}
