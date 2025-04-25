package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;

    private String nombre;
    private String origen;
    private String rol;
    private String alineacion;

    public Personaje(Long idPersonaje, String nombre, String origen, String rol, String alineacion) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.origen = origen;
        this.rol = rol;
        this.alineacion = alineacion;
    }

    public Personaje() {
    }

    public Long getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Long idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }
}
