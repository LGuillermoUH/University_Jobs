package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.IEmpresaDao;
import com.universidad.empleos.web.app.empleos.model.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmpresaServiceImpl implements IEmpresaService {
    @Autowired
    public IEmpresaDao empresaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> findAll() {
        return (List<Empresa>) empresaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Empresa empresa) {
        empresaDao.save(empresa);
    }

    @Override
    @Transactional
    public Empresa findOne(Integer id) {
        return empresaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        empresaDao.deleteById(id);
    }
}
