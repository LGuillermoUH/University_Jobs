package com.universidad.empleos.web.app.empleos.model.dao;

import com.universidad.empleos.web.app.empleos.model.entity.Campus;
import org.springframework.data.repository.CrudRepository;

public interface ICampusDao extends CrudRepository<Campus,Integer> {
}
