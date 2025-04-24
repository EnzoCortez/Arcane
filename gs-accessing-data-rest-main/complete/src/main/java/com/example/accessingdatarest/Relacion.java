package com.example.accessingdatarest;

import jakarta.persistence.*;

@Entity
public class Relacion {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_personaje_a")
    private Personaje personaje1;

    @ManyToOne
    @JoinColumn(name = "id_personaje_b")
    private Personaje personaje2;

    private String tipoRelacion;
}


