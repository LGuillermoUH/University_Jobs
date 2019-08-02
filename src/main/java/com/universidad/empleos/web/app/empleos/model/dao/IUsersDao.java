package com.universidad.empleos.web.app.empleos.model.dao;

import com.universidad.empleos.web.app.empleos.model.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUsersDao extends CrudRepository<Users,Integer> {
}
