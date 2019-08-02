package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Campus;

import java.util.List;

public interface ICampusService {
    public List<Campus> findAll();
    public void save(Campus campus);
    public Campus findOne(Integer id);
    public void delete(Integer id);
}
