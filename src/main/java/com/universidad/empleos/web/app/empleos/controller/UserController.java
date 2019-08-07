package com.universidad.empleos.web.app.empleos.controller;


import com.google.common.collect.Lists;
import com.universidad.empleos.web.app.empleos.model.entity.Users;
import com.universidad.empleos.web.app.empleos.model.service.IUserService;
import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.InternetAddress;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    public EmailService emailService;

    public void sendEmailWithoutTemplating(Integer idPersona) throws UnsupportedEncodingException {
        final Email email = DefaultEmail.builder()
                .from(new InternetAddress("pruebas.hext.pruebas@gmail.com", "Marco Tullio Cicerone "))
                .to(Lists.newArrayList(new InternetAddress("luisg1.luis@gmail.com", "Luis guillermo")))
                .subject("Laelius de amicitia")
                .body("Firmamentum autem stabilitatis constantiaeque eius, quam in amicitia quaerimus, fides est.")
                .encoding("UTF-8").build();

        emailService.send(email);
    }

    //obtiene todos los usuarios
    @GetMapping("/Usuarios")
    public List<Users> AllUsers()  {
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
    @GetMapping("/Usuarios/{isUsuario}")
    public Users usuario(@PathVariable Integer idUsuario){
        return userService.findOne(idUsuario);
    }

}
