package com.universidad.empleos.web.app.empleos.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class Prueba {
    @GetMapping("all")
    public String hello(){
        return "hello";
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedhello(){
        return "secured hello";
    }
}
