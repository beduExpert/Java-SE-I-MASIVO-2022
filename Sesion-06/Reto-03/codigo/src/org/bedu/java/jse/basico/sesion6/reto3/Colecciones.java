package org.bedu.java.jse.basico.sesion6.reto3;

import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();

        Collections.addAll(listaFrutas, "Plátanos", "Sandía", "Pera", "Manzana", "Naranja", "Kiwi");
        muestraFrutas(listaFrutas);

        Collections.reverse(listaFrutas);
        muestraFrutas(listaFrutas);

        System.out.println("\nLa fruta más pequeña es: " + Collections.min(listaFrutas));
        System.out.println("\nLa fruta más grande es: " + Collections.max(listaFrutas));

        Collections.sort(listaFrutas);
        muestraFrutas(listaFrutas);

        System.out.println("\nLa Pera está en la posición: " + Collections.binarySearch(listaFrutas, "Pera"));
        System.out.println("\nLa Manzana está en la posición: " + Collections.binarySearch(listaFrutas, "Manzana"));

        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        muestraFrutas(listaFrutas);

        Collections.shuffle(listaFrutas);
        muestraFrutas(listaFrutas);

        System.out.println("\nHay " + Collections.frequency(listaFrutas, "Manzana") + " en la lista.");
    }

    private static void muestraFrutas(List<String> lista) {
        System.out.println();
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
}
