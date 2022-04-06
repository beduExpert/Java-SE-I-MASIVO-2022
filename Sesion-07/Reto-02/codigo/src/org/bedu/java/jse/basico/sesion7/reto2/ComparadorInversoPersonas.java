package org.bedu.java.jse.basico.sesion7.reto2;

import java.util.Comparator;

public class ComparadorInversoPersonas  implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        String nombreCompletoPersona1 = persona1.getNombre() + persona1.getApellido();
        String nombreCompletoPersona2 = persona2.getNombre() + persona2.getApellido();

        return nombreCompletoPersona2.compareTo(nombreCompletoPersona1);
    }
}
