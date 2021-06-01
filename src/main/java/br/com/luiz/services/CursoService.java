package br.com.luiz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.entities.Curso;
import br.com.luiz.repositories.CursoRepository;

@Service
public class CursoService {

	
	@Autowired
	CursoRepository cursoRepository;
	
	public List<Curso> findCursos(){
		return this.cursoRepository.findAll();
	}
	
	public Optional<Curso> findCursoById(Long id) {
		return this.cursoRepository.findById(id);
	}
	
}
