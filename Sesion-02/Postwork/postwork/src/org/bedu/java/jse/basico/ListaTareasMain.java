package org.bedu.java.jse.basico;

public class ListaTareasMain {
    public static void main(String[] args) {

        short opcionSeleccionada = 3;
        String mensaje;
        
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas.");
        System.out.println("5. Eliminar lista de tareas");


        switch (opcionSeleccionada) {
            case 1:
                mensaje = "Crear nueva lista de tareas.";
                break;
            case 2:
                mensaje = "Ver listas de tareas.";
                break;
            case 3:
                mensaje = "Ver tareas de lista.";
                break;
            case 4:
                mensaje = "Actualizar lista de tareas.";
                break;
            case 5:
                mensaje = "Eliminar lista de tareas.";
                break;
            default:
                mensaje = "Opción desconocida.";
        }

        System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada + " " + mensaje);
        System.out.println("En construcción.");

    }
}
