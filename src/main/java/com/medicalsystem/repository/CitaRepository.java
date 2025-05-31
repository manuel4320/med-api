package com.medicalsystem.repository;

import com.medicalsystem.model.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitaRepository extends MongoRepository<Cita, String> {}