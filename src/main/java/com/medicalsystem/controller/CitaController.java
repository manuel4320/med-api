package com.medicalsystem.controller;

import com.medicalsystem.dto.ModificarFechaRequest;
import com.medicalsystem.model.Cita;
import com.medicalsystem.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/citas")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @PostMapping("/agendar")
    public Cita agendarCita(@RequestBody Cita cita) {
        return citaService.agendarCita(cita);
    }

    @PutMapping("/modificar")
    public Optional<Cita> modificarFecha(@RequestBody ModificarFechaRequest request) {
        return citaService.modificarFecha(request.getCitaId(), request.getNuevaFecha());
    }
}
