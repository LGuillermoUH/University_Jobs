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

import com.universidad.empleos.web.app.empleos.model.entity.Empresa;
import com.universidad.empleos.web.app.empleos.model.service.IEmpresaService;

@RestController
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping("/Empresas/")
	public List<Empresa> AllEmpresas(){
		return empresaService.findAll();
	}
	
	@PostMapping("/Empresas/Crear")
	public void crearEmpresa(@Valid @RequestBody Empresa empresa) {
		empresaService.save(empresa);
	}
	
	@DeleteMapping("/Empresas/Borrar/{idEmpresa}")
	public void borrarEmpresa(@PathVariable Integer idEmpresa) {
		empresaService.delete(idEmpresa);
	}
	
	@GetMapping("/Empresas/{idEmpresa}")
	public Empresa empresa(@PathVariable Integer idEmpresa) {
		return empresaService.findOne(idEmpresa);
	}
}
