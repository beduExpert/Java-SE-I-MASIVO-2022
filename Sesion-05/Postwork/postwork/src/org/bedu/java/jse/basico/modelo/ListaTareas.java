package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;

public class ListaTareas {
    private String nombre;
    private final LocalDate fechaCreacion;

    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTareas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
