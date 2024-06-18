package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
	private final UserDetailsService userDetailsService;
	private final PasswordEncoder passwordEncoder;
	
	
	@Bean 
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder);
		return provider;
	}

	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
		AuthenticationManagerBuilder authBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
		return authBuilder.authenticationProvider(daoAuthenticationProvider()).build();

	}
	
	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                        (authz) -> authz.requestMatchers("/css/**", "/js/**", "/img/**", "/h2-console/**", "/registro/", "/login/").permitAll()
                                .requestMatchers("/admin/**").hasRole("ADMIN")
								.requestMatchers("/categoria/**", "/productos/**", "/cliente/**", "/usuarios/**").hasAnyRole("ADMIN", "USER")
                                .anyRequest().authenticated())
                .formLogin((loginz) -> loginz
                        .loginPage("/login").permitAll())
                .logout((logoutz) -> logoutz
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/")
                        .permitAll());

        // Añadimos esto para poder seguir accediendo a la consola de H2
        http.csrf(csrfz -> csrfz.disable());
        http.headers(headersz -> headersz
                .frameOptions(frameOptionsz -> frameOptionsz.disable()));

        return http.build();
    }

}