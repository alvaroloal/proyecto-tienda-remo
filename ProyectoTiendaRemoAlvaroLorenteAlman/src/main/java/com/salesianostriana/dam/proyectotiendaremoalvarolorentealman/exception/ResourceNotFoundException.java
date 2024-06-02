package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.exception;

public class ResourceNotFoundException extends RuntimeException {
	//el constructor recibe un mensaje y lo pasa a la superclase RunTimeException
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
