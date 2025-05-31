package com.medicalsystem.service;

import com.medicalsystem.dto.LoginRequest;
import com.medicalsystem.model.Usuario;
import com.medicalsystem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean login(LoginRequest request) {
        Optional<Usuario> usuario = usuarioRepository.findByUsername(request.getUsername());
        return usuario.map(u -> u.getPassword().equals(request.getPassword())).orElse(false);
    }
}
