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

import com.universidad.empleos.web.app.empleos.model.entity.Carreras;
import com.universidad.empleos.web.app.empleos.model.service.ICarrerasService;

@RestController
public class CarrerasController {
	@Autowired
	private ICarrerasService carrerasService;
	
	@GetMapping("/Carreras/")
	public List<Carreras> AllCarreras(){
		return carrerasService.findAll();
	}
	
	@PostMapping("/Carreras/Crear")
	public void crearCarrera(@Valid @RequestBody Carreras carreras) {
		carrerasService.save(carreras);
	}
	
	@DeleteMapping("/Carreras/Borrar/{idCarrera}")
	public void borrarCarrera(@PathVariable Integer idCarrera) {
		carrerasService.delete(idCarrera);
	}
	
	@GetMapping("/Carreras/{idCarrera}")
	public Carreras carrera(@PathVariable Integer idCarrera) {
		return carrerasService.findOne(idCarrera);
	}
}
