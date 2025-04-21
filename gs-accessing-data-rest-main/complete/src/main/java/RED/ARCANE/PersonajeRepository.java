package RED.ARCANE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    List<Personaje> findByNombreContainingIgnoreCase(String nombre); // Búsqueda por nombre
}

