package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Users;

import java.util.List;

public interface IUserService {
    public List<Users> findAll();
    public void save(Users users);
    public Users findOne(Integer id);
    public void delete(Integer id);
}
