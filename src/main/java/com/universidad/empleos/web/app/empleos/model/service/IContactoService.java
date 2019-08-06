package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Contacto;

import java.util.List;

public interface IContactoService {
     List<Contacto> findAll();
     void save(Contacto contacto);
     Contacto findOne(Integer id);
     void delete(Integer id);
}
