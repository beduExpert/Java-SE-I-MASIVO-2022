package org.bedu.java.jse.basico;

public class Menu {
    public void muestraOpciones() {
        System.out.println("\n==SELECCIONA UNA OPCIÓN==\n");
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas.");
        System.out.println("5. Eliminar lista de tareas");
        System.out.println("6. Guardar y Salir");
    }

    public void muestraOpcionesTarea() {
        System.out.println("\n==SELECCIONA UNA OPCIÓN==\n");
        System.out.println("1. Agregar nueva tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Marcar tarea como realizada");
        System.out.println("4. Regresar");
    }
}
