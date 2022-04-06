package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;

public class ListaTarea {
    private String nombre;
    private LocalDate fechaCreacion;

    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTarea(String nombre) {
        this.nombre = nombre;
    }
}
