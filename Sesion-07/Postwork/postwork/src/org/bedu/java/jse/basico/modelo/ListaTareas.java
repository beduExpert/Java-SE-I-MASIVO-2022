package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private String nombre;
    private final LocalDate fechaCreacion;
    private final List<Tarea> tareas = new ArrayList<>();

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


    public void agregaTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public Tarea eliminaTarea(int indice) {
        if (indice > tareas.size()) {
            System.out.println("La tarea indicada no se encuentra en la lista.");
            return null;
        }

        return tareas.remove(indice);
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public int numeroTareas() {
        return tareas.size();
    }

    public void muestraTareas() {
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            System.out.println((i + 1) + " - " + tarea.getNombre() + "[" + (tarea.isRealizada() ? "█" : " ")  + "] " + (tarea.isRealizada() ? tarea.getFechaRealizacion() : ""));
        }
    }
}
