package com.universidad.empleos.web.app.empleos.model.dao;

import com.universidad.empleos.web.app.empleos.model.entity.Universidad;
import org.springframework.data.repository.CrudRepository;

public interface IUniversidadDao extends CrudRepository<Universidad,Integer> {
}
