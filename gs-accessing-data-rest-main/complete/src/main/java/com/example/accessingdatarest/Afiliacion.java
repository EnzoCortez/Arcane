package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Afiliacion {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Personaje personaje;

    @ManyToOne
    private Organizacion organizacion;

    private String rol;
    private Date fechaIngreso;
}


