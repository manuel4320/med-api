package com.tuempresa.sistemacitas.controller;

import com.tuempresa.sistemacitas.model.Usuario;
import com.tuempresa.sistemacitas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public String login(@RequestBody Usuario request) {
        Usuario user = usuarioRepository.findByEmailAndPassword(request.getEmail(), request.getPassword());
        if (user != null) {
            return "Login exitoso";
        } else {
            return "Credenciales inválidas";
        }
    }
}
