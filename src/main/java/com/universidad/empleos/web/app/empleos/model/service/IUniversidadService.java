package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Universidad;

import java.util.List;

public interface IUniversidadService {
    public List<Universidad> findAll();
    public void save(Universidad universidad);
    public Universidad findOne(Integer id);
    public void delete(Integer id);
}
