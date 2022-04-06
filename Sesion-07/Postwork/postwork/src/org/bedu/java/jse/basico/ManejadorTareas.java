package org.bedu.java.jse.basico;

import org.bedu.java.jse.basico.modelo.ListaTareas;
import org.bedu.java.jse.basico.modelo.Tarea;

import java.time.LocalDate;

public class ManejadorTareas {

    private final Lector lector = new Lector();

    public Tarea nuevaTarea() {
        System.out.println("Nueva Tarea");
        System.out.println("Introduce los datos de la nueva tarea: ");
        System.out.println("Nombre:");
        String nombreTarea = lector.leeCadena();

        return new Tarea(nombreTarea);
    }

    public Tarea eliminaTarea(ListaTareas listaTareas) {
        System.out.println("Eliminar tarea");

        System.out.println("Indica el índice de la tarea a eliminar");
        byte indice = lector.leeOpcion();

        if (indice > listaTareas.numeroTareas()) {
            System.out.println("La tarea indicada no existe.");
            return null;
        }

        return listaTareas.eliminaTarea(indice - 1);
    }

    public Tarea marcarTareaFinalizada(ListaTareas listaTareas) {
        System.out.println("Finalizar tarea");

        System.out.println("Indica el índice de la tarea a marcar");
        byte indice = lector.leeOpcion();

        if (indice > listaTareas.numeroTareas()) {
            System.out.println("La tarea indicada no existe.");
            return null;
        }

        Tarea tarea = listaTareas.getTareas().get(indice - 1);
        tarea.setFechaRealizacion(LocalDate.now());
        tarea.setRealizada(true);

        return tarea;
    }

}
