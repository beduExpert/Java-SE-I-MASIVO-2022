package org.bedu.java.jse.basico.sesion6.ejemplo3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

/*        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
        }*/

        for (String cadena : listaCadenas){
            //System.out.println(cadena);
        }

        //System.out.println();

        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("tres");
        setCadenas.add("cuatro");
        setCadenas.add("cinco");

        for (String cadena : setCadenas){
            //System.out.println(cadena);
        }

        //System.out.println();
        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cuatro"));
        listaNumeros.add(new Numero("cinco"));

        for (Numero numero : listaNumeros){
            //System.out.println(numero.getNombre());
        }

        //System.out.println();
        Set<Numero> setNumeros = new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        setNumeros.add(new Numero("cinco"));

        for (Numero numero : setNumeros){
            System.out.println(numero.getNombre());
        }
    }
}
