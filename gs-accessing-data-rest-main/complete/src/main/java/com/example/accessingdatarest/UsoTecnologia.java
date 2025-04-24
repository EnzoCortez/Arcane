package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UsoTecnologia {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Personaje personaje;

    @ManyToOne
    private Tecnologia tecnologia;
}


