package com.universidad.empleos.web.app.empleos.model.dao;

import com.universidad.empleos.web.app.empleos.model.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaDao extends CrudRepository<Empresa,Integer> {
}
