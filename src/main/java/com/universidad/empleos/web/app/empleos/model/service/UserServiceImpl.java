package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.IUsersDao;
import com.universidad.empleos.web.app.empleos.model.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    public IUsersDao usersDao;
    @Transactional(readOnly = true)
    @Override
    public List<Users> findAll() {
        return (List<Users>) usersDao.findAll();
    }
    @Transactional
    @Override
    public void save(Users users) {
        usersDao.save(users);
    }
    @Transactional
    @Override
    public Users findOne(Integer id) {
        return usersDao.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(Integer id) {
        usersDao.deleteById(id);
    }
}
