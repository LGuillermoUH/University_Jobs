package com.universidad.empleos.web.app.empleos.model.dao;

import com.universidad.empleos.web.app.empleos.model.entity.Carreras;
import org.springframework.data.repository.CrudRepository;

public interface ICarrerasDao extends CrudRepository<Carreras,Integer> {
}
