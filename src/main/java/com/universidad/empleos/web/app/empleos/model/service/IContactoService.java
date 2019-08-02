package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Contacto;

import java.util.List;

public interface IContactoService {
    public List<Contacto> findAll();
    public void save(Contacto contacto);
    public Contacto findOne(Integer id);
    public void delete(Integer id);
}
