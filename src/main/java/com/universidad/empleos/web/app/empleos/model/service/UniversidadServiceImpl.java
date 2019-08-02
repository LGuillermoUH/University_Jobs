package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.IUniversidadDao;
import com.universidad.empleos.web.app.empleos.model.entity.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UniversidadServiceImpl implements IUniversidadService{
    @Autowired
    public IUniversidadDao universidadDao;

    @Override
    @Transactional(readOnly = true)
    public List<Universidad> findAll() {
        return (List<Universidad>) universidadDao.findAll();
    }

    @Override
    @Transactional
    public void save(Universidad universidad) {
        universidadDao.save(universidad);
    }

    @Override
    @Transactional
    public Universidad findOne(Integer id) {
        return universidadDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        universidadDao.deleteById(id);
    }
}
