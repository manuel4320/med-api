package com.medicalsystem.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;

    private String cc;
    private String email;
    private String telefono;
    private String password;
}
