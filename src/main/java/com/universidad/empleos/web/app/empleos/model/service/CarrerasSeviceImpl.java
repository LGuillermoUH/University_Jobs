package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.ICarrerasDao;
import com.universidad.empleos.web.app.empleos.model.entity.Carreras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CarrerasSeviceImpl implements ICarrerasService {
    @Autowired
    public ICarrerasDao carrerasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Carreras> findAll() {
        return (List<Carreras>) carrerasDao.findAll();
    }

    @Override
    @Transactional
    public void save(Carreras carreras) {
        carrerasDao.save(carreras);
    }

    @Override
    @Transactional
    public Carreras findOne(Integer id) {
        return carrerasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        carrerasDao.deleteById(id);
    }
}
