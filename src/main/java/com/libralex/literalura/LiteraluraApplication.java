package com.libralex.literalura;


import com.libralex.literalura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.libralex.literalura.repository.AutorRepository;
import com.libralex.literalura.repository.LibroRepository;

@SpringBootApplication(scanBasePackages = {"com.libralex.literalura", "com/libralex/literalura/principal", "com/libralex/literalura/model", "com/libralex/literalura/repository", "com/libralex/literalura/service"})
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


