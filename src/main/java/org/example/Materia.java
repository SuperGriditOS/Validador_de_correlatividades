package org.example;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Setter
@Getter
public class Materia {
    private String nombre;
    private Set<Materia> correlativa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMateriasAprobadas() {
        return correlativa;
    }

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(correlativa);
    }
}
