package com.universidad.empleos.web.app.empleos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.empleos.web.app.empleos.model.entity.Universidad;
import com.universidad.empleos.web.app.empleos.model.service.IUniversidadService;

@RestController
public class UniversidadController {
	@Autowired
	private IUniversidadService universidadService;
	
	@GetMapping("/Universidades/")
	public List<Universidad> AllUniversidades(){
		return universidadService.findAll();
	}
	
	@PostMapping("/Universidades/Crear")
	public void crearUniversidad(@Valid @RequestBody Universidad universidad) {
		universidadService.save(universidad);
	}
	
	@DeleteMapping("/Universidades/Borrar/{idUniversidad}")
	public void borrarUniversidad(@PathVariable Integer idUniversidad) {
		universidadService.delete(idUniversidad);
	}
	
	@GetMapping("/Universidades/{idUniversidad}")
	public Universidad universidad(@PathVariable Integer idUniversidad) {
		return universidadService.findOne(idUniversidad);
	}
}
