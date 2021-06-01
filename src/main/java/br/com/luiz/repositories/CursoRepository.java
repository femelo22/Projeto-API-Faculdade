package br.com.luiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiz.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
