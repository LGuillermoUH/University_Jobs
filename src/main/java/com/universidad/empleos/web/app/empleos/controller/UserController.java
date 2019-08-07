package com.universidad.empleos.web.app.empleos.controller;

import com.universidad.empleos.web.app.empleos.model.entity.Users;
import com.universidad.empleos.web.app.empleos.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    //obtiene todos los usuarios
    @GetMapping("/Usuarios")
    public List<Users> AllUsers(){
        return userService.findAll();
    }
    //insert
    @PostMapping("/Usuarios/Crear")
    public void crearUsuario(@Valid @RequestBody Users users){
         userService.save(users);
         
    }
    //delete
    @DeleteMapping("/Usuarios/Borrar/{idUsuario}")
    public void borrarUsuario(@PathVariable Integer idUsuario){
        userService.delete(idUsuario);
    }
    //un solo usuario
    @GetMapping("/Usuarios/{idUsuario}")
    public Users usuario(@PathVariable Integer idUsuario){
        return userService.findOne(idUsuario);
    }

}
