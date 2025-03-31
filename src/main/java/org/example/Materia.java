package org.example;

import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativa;


    public Set<Materia> getMateriasAprobadas() {
        return correlativa;
    }

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(correlativa);
    }
}
