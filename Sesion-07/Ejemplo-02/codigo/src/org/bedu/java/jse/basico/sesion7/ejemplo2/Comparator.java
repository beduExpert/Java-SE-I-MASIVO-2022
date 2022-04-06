package org.bedu.java.jse.basico.sesion7.ejemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Arnulfo", "López",  1.65F);
        Persona persona2 = new Persona("José", "Saavedra",  1.71F);
        Persona persona3 = new Persona("Carolina", "Rivera",  1.51F);
        Persona persona4 = new Persona("Rubén", "González",  1.60F);
        Persona persona5 = new Persona("Julia", "Álvarez",  1.54F);

        List<Persona> personas = new LinkedList<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);

        Collections.sort(personas);

        for (Persona p : personas){
            System.out.println(p.getNombre() + " " + p.getApellido() + ": " + p.getEstatura());
        }
    }
}
