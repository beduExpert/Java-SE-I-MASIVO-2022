package org.bedu.java.jse.basico.sesion2.ejemplo3;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
//            System.out.println("El valor de i es " + i);
        }

        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < valores.length; i++) {
            //System.out.println("El valor actual del arreglo es " + valores[i]);
        }

        for (int i = 1; i < valores.length; i += 2) {
            //System.out.println("El valor actual del arreglo es " + valores[i]);
        }

        for (short valor : valores) {
            //System.out.println("El valor actual del arreglo es " + valor);
        }

        short i = 0;

        while (++i <= 10) {
            //System.out.println("El valor de i es " + i);
        }

        i = 1;

        do {
            System.out.println("El valor de i es " + i);
        } while (i++ < 10);
    }
}
