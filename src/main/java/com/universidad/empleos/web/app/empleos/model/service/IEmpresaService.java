package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    public List<Empresa> findAll();
    public void save(Empresa empresa);
    public Empresa findOne(Integer id);
    public void delete(Integer id);
}
