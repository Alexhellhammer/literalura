package com.libralex.literalura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Principal;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private LibroRepository libroRepository;
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository, libroRepository);
		principal.mostrarMenu();
	}
}
