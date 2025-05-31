package com.tuempresa.sistemacitas.controller;

import com.tuempresa.sistemacitas.model.Cita;
import com.tuempresa.sistemacitas.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaRepository citaRepository;

    // HU02 - Agendar nueva cita
    @PostMapping
    public Cita agendarCita(@RequestBody Cita cita) {
        return citaRepository.save(cita);
    }

    // HU03 - Modificar fecha de cita existente
    @PutMapping("/{id}")
    public String modificarFechaCita(@PathVariable String id, @RequestBody Cita citaActualizada) {
        Optional<Cita> optionalCita = citaRepository.findById(id);
        if (optionalCita.isPresent()) {
            Cita cita = optionalCita.get();
            cita.setFecha(citaActualizada.getFecha());
            citaRepository.save(cita);
            return "Fecha de la cita modificada con éxito";
        } else {
            return "Cita no encontrada";
        }
    }
}
