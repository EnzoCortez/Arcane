package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tecnologia {
    @Id
    private Long idTecnologia;
    private String nombre;
    private String tipo;
    private String descripcion;
}


