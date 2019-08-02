package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Carreras;

import java.util.List;

public interface ICarrerasService {
    public List<Carreras> findAll();
    public void save(Carreras carreras);
    public Carreras findOne(Integer id);
    public void delete(Integer id);
}
