package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class AlumnoTest {

    @Test
    public void agregarMateriaAprobada() {
        // Crear una materia
        Materia dsi = new Materia("Diseño de sistemas");

        // Crear un alumno
        Alumno alumno = new Alumno("Juan", "Pérez");

        // Agregar la materia aprobada al alumno
        alumno.agregarMateriaAprobada(dsi);

        // Verificar que la materia se agregó correctamente
        Assertions.assertTrue(alumno.getMateriasAprobadas().contains(dsi));

        // Verificar que el nombre de la materia sea correcto
        Assertions.assertEquals("Diseño de sistemas", dsi.getNombre());
    }
}
