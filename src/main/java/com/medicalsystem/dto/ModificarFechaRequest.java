package com.medicalsystem.dto;

import java.time.LocalDateTime;

public class ModificarFechaRequest {
    private String citaId;
    private LocalDateTime nuevaFecha;

    public String getCitaId() { return citaId; }
    public void setCitaId(String citaId) { this.citaId = citaId; }
    public LocalDateTime getNuevaFecha() { return nuevaFecha; }
    public void setNuevaFecha(LocalDateTime nuevaFecha) { this.nuevaFecha = nuevaFecha; }
}