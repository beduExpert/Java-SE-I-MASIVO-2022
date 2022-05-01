package org.bedu.java.jse.basico.sesion02.tarea;

public class Main {

    public static void main(String[] args) {

        int limiteSuperior = 100; // definimos nuestro número máximo
        System.out.println("Lista de números primos entre 1 y " + limiteSuperior);
        Primos primos = new Primos(); // creamos la instancia de nuestro validador

        for (int num = 2; num <= limiteSuperior; num++) { // ciclo para recorrer el rango
            if (primos.esPrimo(num) == true) { // uso de la validación
                System.out.println(num);
            }
        }

    }
}
