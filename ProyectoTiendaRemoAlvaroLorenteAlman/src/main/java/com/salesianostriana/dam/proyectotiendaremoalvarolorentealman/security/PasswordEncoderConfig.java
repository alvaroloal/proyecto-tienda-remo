package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
<<<<<<< HEAD

=======
>>>>>>> 68fffa0ecb919a4dff89356a22aac52d875ba7e8
@Configuration
public class PasswordEncoderConfig {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	
}
