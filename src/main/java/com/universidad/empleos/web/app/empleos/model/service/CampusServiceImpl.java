package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.ICampusDao;
import com.universidad.empleos.web.app.empleos.model.entity.Campus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CampusServiceImpl implements ICampusService {
    @Autowired
    private ICampusDao campusDao;

    @Override
    @Transactional(readOnly = true)
    public List<Campus> findAll() {
        return (List<Campus>) campusDao.findAll();
    }

    @Override
    @Transactional
    public void save(Campus campus) {
        campusDao.save(campus);
    }

    @Override
    @Transactional
    public Campus findOne(Integer id) {
        return campusDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        campusDao.deleteById(id);
    }
}
