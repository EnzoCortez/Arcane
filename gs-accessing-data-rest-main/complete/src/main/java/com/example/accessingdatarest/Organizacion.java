package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organizacion {
    @Id
    private Long idOrganizacion;
    private String nombre;
    private String ciudadBase;
    private String tipo;
}


