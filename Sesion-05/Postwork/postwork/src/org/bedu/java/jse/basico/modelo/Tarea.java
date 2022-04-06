package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private final LocalDate fechaCreacion;
    private LocalDate fechaExpiracion;
    private boolean realizada;
    private LocalDate fechaRealizacion;

    {
        fechaCreacion = LocalDate.now();
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tarea tarea = (Tarea) o;

        return nombre.equals(tarea.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
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

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
}
