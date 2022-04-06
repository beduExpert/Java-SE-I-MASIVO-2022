package org.bedu.java.jse.basico.sesion7.reto1;

public class Telefono implements Comparable<Telefono> {
    private final String numero;
    private final int prioridad;

    public Telefono(String numero, int prioridad) {
        this.numero = numero;
        this.prioridad = prioridad;
    }

    public String getNumero() {
        return numero;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Telefono telefono) {
        return this.prioridad - telefono.prioridad;
    }
}
