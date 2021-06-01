package br.com.luiz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luiz.entities.Curso;
import br.com.luiz.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoApiFaculApplication implements CommandLineRunner{

	@Autowired
	CursoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiFaculApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Curso curso3 = new Curso();
		
		curso1.setNome("Educação fisica");
		curso2.setNome("Tecnologia da informação");
		curso3.setNome("Administração");
		
		repository.saveAll(Arrays.asList(curso1, curso2, curso3));
	}

}
