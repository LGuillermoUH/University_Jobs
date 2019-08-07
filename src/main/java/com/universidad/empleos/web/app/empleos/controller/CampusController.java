package com.universidad.empleos.web.app.empleos.controller;

import com.universidad.empleos.web.app.empleos.model.entity.Campus;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.universidad.empleos.web.app.empleos.model.service.ICampusService;

@RestController
public class CampusController {
	@Autowired
	private ICampusService campusService;
	
	@GetMapping("/Campus/")
	public List<Campus> AllCampus(){
		return campusService.findAll();
	}
	
	@PostMapping("/Campus/Crear")
	public void crearCampus(@Valid @RequestBody Campus campus) {
		campusService.save(campus);
	}
	
	@DeleteMapping("/Campus/Borrar/{idCampus}")
	public void borrarCampus(@PathVariable Integer idCampus) {
		campusService.delete(idCampus);
	}
	
	@GetMapping("/Campus/{idCampus}")
	public Campus campus(@PathVariable Integer idCampus) {
		return campusService.findOne(idCampus);
	}
}
