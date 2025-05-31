package com.medicalsystem.service;

import com.medicalsystem.model.Cita;
import com.medicalsystem.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    public Cita agendarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Optional<Cita> modificarFecha(String id, LocalDateTime nuevaFecha) {
        Optional<Cita> citaOpt = citaRepository.findById(id);
        citaOpt.ifPresent(cita -> {
            cita.setFecha(nuevaFecha);
            citaRepository.save(cita);
        });
        return citaOpt;
    }
}