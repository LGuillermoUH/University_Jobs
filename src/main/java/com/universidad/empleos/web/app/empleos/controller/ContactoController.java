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

import com.universidad.empleos.web.app.empleos.model.entity.Contacto;
import com.universidad.empleos.web.app.empleos.model.service.IContactoService;

@RestController
public class ContactoController {
	@Autowired
	private IContactoService contactoService;
	
	@GetMapping("/Contactos/")
	public List<Contacto> AllContactos(){
		return contactoService.findAll();
	}
	
	@PostMapping("/Contactos/Crear")
	public void crearContacto(@Valid @RequestBody Contacto contacto) {
		contactoService.save(contacto);
	}
	
	@DeleteMapping("/Contactos/Borrar/{idContacto}")
	public void borrarCampus(@PathVariable Integer idContacto) {
		contactoService.delete(idContacto);
	}
	
	@GetMapping("/Contactos/{idContacto}")
	public Contacto contacto(@PathVariable Integer idContacto) {
		return contactoService.findOne(idContacto);
	}
}
