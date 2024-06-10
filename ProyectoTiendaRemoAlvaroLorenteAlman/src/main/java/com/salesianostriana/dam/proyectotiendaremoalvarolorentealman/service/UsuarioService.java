package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.base.BaseServiceImpl;

@Service
public class UsuarioService extends BaseServiceImpl<Usuario, Long, UsuarioRepository> {

	@Autowired
	private UsuarioRepository repositorioUsuario;
	
	/*
	 * public List<Usuario> findALL(){ return repositorioUsuario.findAll(); }
	 * 
	 * public Usuario findById(Long id){ return
	 * repositorioUsuario.findById(id).orElse(null); }
	 * 
	 * 
	 * public Usuario save(Usuario usuario){ return
	 * repositorioUsuario.save(usuario);
	 * 
	 * }
	 * 
	 * public Usuario delete(Usuario usuario){ Usuario resultado =
	 * findById(usuario.getId());
	 * 
	 * repositorioUsuario.delete(resultado); return resultado;
	 * }
	 */
	
	private List<Usuario> obtenerUsuarios() {
		return this.findAll();
	}

	private boolean usuarioExiste(String username) {
		List<Usuario> listaUsuarios = this.obtenerUsuarios();

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}

	/* a traves del Base service interactua con el repositorio y este los crea */
	public void crearUsuario(Usuario nuevoUsuario) {

		if (!this.usuarioExiste(nuevoUsuario.getUsername())) {
			this.save(nuevoUsuario);
		}
	}

	
	  /*public void borrarUsuario1(Long id) {
	  
	  this.deleteById(id); }*/
	 

	public Usuario guardarUsuario(Usuario usuario) {
		//return repositorioUsuario.save(usuario);
		return this.repository.save(usuario);
	}

	/* obtener usuario por su id */

	public Optional<Usuario> obtenerById(Long id) {
		return this.findById(id);
	}
	
	
	
	/*
	 * 
	 * */
	public Usuario actualizarPorId(Usuario request, Long id) {

		Usuario usuario = repositorioUsuario.findById(id).get();
		usuario.setNombreCompleto(request.getNombreCompleto());
		usuario.setUsername(request.getUsername());
		usuario.setContrasenia(request.getContrasenia());
		/* usuario.setEsAdmin(request.getEsAdmin()); */
		return usuario;
	}

	public Boolean borrarUsuario(Long id) {
		try {
			this.repository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	/* public void editarUsuario(Usuario usuario) {} */

}
