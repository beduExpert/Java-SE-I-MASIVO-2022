package org.bedu.java.jse.basico;

public class ListaTareasMain {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSeleccionada = 0;

        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();

            System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }

        }while(opcionSeleccionada != 6);
    }
}
