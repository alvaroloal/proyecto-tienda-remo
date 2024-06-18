/*package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman;


import java.util.List;

import jakarta.annotation.PostConstruct;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Categoria;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Producto;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Cliente;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.CategoriaRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ProductoRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.UsuarioRepository;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {
	
	private final UsuarioRepository repositorioUsuario;
	
	private final CategoriaRepository categoriaRepository;

	private final ProductoRepository productoRepository;

	private final ClienteRepository clienteRepository;

	private final PasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void init() {	
		
		Usuario usuario = Usuario.builder()
				.admin(false)
				.username("user")
				.password(passwordEncoder.encode("1234"))
				.build();
		
		Usuario admin = Usuario.builder()
				.admin(true)
				.username("admin")
				.password(passwordEncoder.encode("admin"))
				.build();
		
		repositorioUsuario.saveAll(List.of(usuario, admin));

		Cliente cliente = new Cliente("Alvaro", passwordEncoder.encode("cliente"), "Alvaro", "Lorente", "954342431", "Triana", "00000000Q", "email");

		clienteRepository.save(cliente);
		
        Categoria componentes = new Categoria("Componentes", true, "");
        Categoria barcos = new Categoria("Barcos", false, "");
        Categoria ropaDeportiva = new Categoria("Ropa deportiva", false, "");

        categoriaRepository.save(componentes);
        categoriaRepository.save(barcos);
        categoriaRepository.save(ropaDeportiva);

		Producto remo = new Producto("Remo", "Nos proporciona la fuerza para el movimiento del bote", 150, 10, "https://www.empacher.com/fileadmin/EN/products/oars/oar_bags.JPG", componentes);
        Producto orza = new Producto("Orza", "Es la estructura donde van colocados los remos", 230, 0, "https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Carbonflosse.JPG", componentes);
        Producto platanito = new Producto("Platanito", "Prenda elástica y transpirable", 50, 0, "https://tienda.austral.es/labradoresrc/img/p/1/4/8/1/5/14815-large_default.jpg", ropaDeportiva);

		productoRepository.save(remo);
		productoRepository.save(orza);
		productoRepository.save(platanito);

		
		
	}

}*/
