package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.entity.Users;

import java.util.List;

public interface IUserService {
     List<Users> findAll();
     void save(Users users);
     Users findOne(Integer id);
     void delete(Integer id);
}
