package RED.ARCANE;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Organizacion {
    @Id
    private Long idOrganizacion;
    private String nombre;
    private String ciudadBase;
    private String tipo;
}


