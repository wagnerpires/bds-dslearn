package com.devsuperior.dslearn.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg); // Repassar o argumento para o construtor da superclasse
	}
}