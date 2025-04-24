package com.example.accessingdatarest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("/api/personaje")
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeRepository;

    // GET: Obtener todos los personajes
    @GetMapping("/all")
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    // GET: Buscar personajes por nombre
    @GetMapping("/buscar")
    public List<Personaje> buscarPorNombre(@RequestParam String nombre) {
        return personajeRepository.findByNombreContainingIgnoreCase(nombre);
    }

    // GET: Obtener personaje por ID
    @GetMapping("/{id}")
    public Optional<Personaje> getPersonajeById(@PathVariable Long id) {
        return personajeRepository.findById(id);
    }

    // POST: Crear nuevo personaje
    @PostMapping
    public Personaje crearPersonaje(@RequestBody Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    // PUT: Actualizar personaje
    @PutMapping("/{id}")
    public Personaje actualizarPersonaje(@PathVariable Long id, @RequestBody Personaje personajeDetails) {
        return personajeRepository.findById(id)
                .map(personaje -> {
                    personaje.setNombre(personajeDetails.getNombre());
                    personaje.setOrigen(personajeDetails.getOrigen());
                    personaje.setRol(personajeDetails.getRol());
                    personaje.setAlineacion(personajeDetails.getAlineacion());
                    return personajeRepository.save(personaje);
                })
                .orElseGet(() -> {
                    personajeDetails.setIdPersonaje(id);
                    return personajeRepository.save(personajeDetails);
                });
    }

    // DELETE: Eliminar personaje
    @DeleteMapping("/{id}")
    public void eliminarPersonaje(@PathVariable Long id) {
        personajeRepository.deleteById(id);
    }
}
