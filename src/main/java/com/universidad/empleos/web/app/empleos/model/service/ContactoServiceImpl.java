package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.IContactoDao;
import com.universidad.empleos.web.app.empleos.model.entity.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ContactoServiceImpl implements IContactoService{
    @Autowired
    public IContactoDao contactoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Contacto> findAll() {
        return (List<Contacto>) contactoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    public Contacto findOne(Integer id) {
        return contactoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        contactoDao.deleteById(id);
    }
}
