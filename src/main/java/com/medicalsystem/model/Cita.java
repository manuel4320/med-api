package com.medicalsystem.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "citas")
public class Cita {
    @Id
    private String id;

    private LocalDate fecha;
    private LocalTime hora;

    @DBRef
    private Paciente paciente;
}
