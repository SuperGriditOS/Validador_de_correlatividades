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

    public Inscripcion(Set<Materia> materiasACursar, Boolean fueAprobada, Alumno alumno, LocalDateTime fechaDeEvaluacion) {
        this.materiasACursar = materiasACursar;
        this.fueAprobada = fueAprobada;
        this.alumno = alumno;
        this.fechaDeEvaluacion = fechaDeEvaluacion;
    }

    public void setFueAprobada(Boolean fueAprobada) {
        this.fueAprobada = fueAprobada;
    }

    public boolean aprobada() {
        for (Materia materia : materiasACursar) {
            if (!materia.cumpleCorrelativas(alumno.getMateriasAprobadas())) {
                return false;
            }
        }
        return true;
    }
}
