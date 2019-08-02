package com.universidad.empleos.web.app.empleos.model.dao;

import com.universidad.empleos.web.app.empleos.model.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface IContactoDao extends CrudRepository<Contacto,Integer> {
}
