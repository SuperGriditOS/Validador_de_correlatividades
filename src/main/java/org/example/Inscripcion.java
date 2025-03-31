package org.example;

import java.time.LocalDateTime;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasACursar;
    private Boolean fueAprobada;
    private Alumno alumno;
    private LocalDateTime fechaDeEvaluacion;

    public Boolean getFueAprobada() {
        return fueAprobada;
    }

    public void setFueAprobada(Boolean fueAprobada) {
        this.fueAprobada = fueAprobada;
    }

    private boolean aprobada(){
        //TODO
        return false;
    }
}
