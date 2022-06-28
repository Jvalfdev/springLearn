package com.learningspring.springLearn.controllers;

import com.learningspring.springLearn.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usr = new Usuario();
        usr.setId(id);
        usr.setNombre("Jose");
        usr.setApellido("Vallejo");
        usr.setEmail("jvalfdev@gmail.com");
        usr.setTelefono("65623659");
        return usr;
    }
    @RequestMapping(value = "usuario125")
    public Usuario editUsuario() {
        Usuario usr = new Usuario();
        usr.setNombre("Jose");
        usr.setApellido("Vallejo");
        usr.setEmail("jvalfdev@gmail.com");
        usr.setTelefono("65623659");
        return usr;
    }
    @RequestMapping(value = "usuario1142")
    public Usuario deleteUsuario(@PathVariable Long id) {
        Usuario usr = new Usuario();

        usr.setNombre("Jose");
        usr.setApellido("Vallejo");
        usr.setEmail("jvalfdev@gmail.com");
        usr.setTelefono("65623659");
        return usr;
    }
    @RequestMapping(value = "usuario1234")
    public Usuario searchUsuario() {
        Usuario usr = new Usuario();
        usr.setNombre("Jose");
        usr.setApellido("Vallejo");
        usr.setEmail("jvalfdev@gmail.com");
        usr.setTelefono("65623659");
        return usr;
    }
}
