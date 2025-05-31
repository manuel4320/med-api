package com.medicalsystem.repository;

import com.medicalsystem.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Optional<Usuario> findByEmailAndPassword(String email, String password);
}
