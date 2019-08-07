package com.universidad.empleos.web.app.empleos;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEmailTools
public class EmpleosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpleosApplication.class, args);
    }

}
