package com.medicalsystem.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pacientes")
public class Paciente extends Usuario {
    // puedes añadir campos específicos del paciente si los necesitas
}
