package RED.ARCANE;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Tecnologia {
    @Id
    private Long idTecnologia;
    private String nombre;
    private String tipo;
    private String descripcion;
}


