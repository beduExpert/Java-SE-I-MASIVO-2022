package org.bedu.java.jse.basico;

import org.bedu.java.jse.basico.modelo.ListaTareas;
import org.bedu.java.jse.basico.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public class ListasTareas {

    private Lector lector = new Lector();
    private List<ListaTareas> listasTareas = new ArrayList<>();

    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListaTareas lista = new ListaTareas(nombre);
        listasTareas.add(lista);
    }

    public void verListaTareas() {
        System.out.println("Ver listas de tareas.");

        if (!validaExistenciaLista()) {
            return;
        }

        for (int i = 0; i < listasTareas.size(); i++) {
            System.out.println((i + 1) + " - " + listasTareas.get(i).getNombre());
        }
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");

        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }

        ListaTareas lista = listasTareas.get(indice - 1);

        if (lista.numeroTareas() == 0) {
            System.out.println("Aún no hay tareas en la lista.");
        }

        lista.muestraTareas();
    }

    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");

        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }
    }

    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");

        byte indice = validaIndice();

        if(indice == 0){
            return;
        }

        ListaTareas listaEliminada = listasTareas.remove((indice - 1));

        System.out.println("Se eliminó la lista de tareas: " + listaEliminada.getNombre());
    }



    private boolean validaExistenciaLista() {
        if (listasTareas != null && !listasTareas.isEmpty()) {
            return true;
        }

        System.out.println("Aún no se ha creado ninguna lista de tareas.");
        return false;
    }

    private byte validaIndice() {
        byte indice = 0;

        if (!validaExistenciaLista()) {
            return indice;
        }

        System.out.println("Indique el índice de la lista de tareas.");
        indice = lector.leeOpcion();

        if (indice > listasTareas.size() || indice < 0) {
            System.out.println("No existen listas de tareas en el índice seleccionado.");
            indice = 0;
        }

        return indice;
    }
}
