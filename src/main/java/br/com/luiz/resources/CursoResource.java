package br.com.luiz.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.services.CursoService;

@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {

	@Autowired
	CursoService service;
	
	@GetMapping
	public ResponseEntity get() {
		return ResponseEntity.ok(this.service.findCursos());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity get(@PathVariable("id") Long id) {
		return ResponseEntity.ok(this.service.findCursoById(id));
	}
	
	
}
