package org.bedu.java.jse.basico;

import org.bedu.java.jse.basico.modelo.ListaTareas;

public class ListasTareas {

    private Lector lector = new Lector();

    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListaTareas lista = new ListaTareas(nombre);
    }

    public void verListaTareas() {
        System.out.println("Ver listas de tareas.");
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");

        byte lista = lector.leeOpcion();
    }

    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");

        byte lista = lector.leeOpcion();
    }


    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");
        byte lista = lector.leeOpcion();
    }
}
