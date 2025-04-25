package com.example.accessingdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "*")
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    List<Personaje> findByNombreContainingIgnoreCase(String nombre);
}

