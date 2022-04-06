package org.bedu.java.jse.basico.sesion7.ejemplo1;

public class Libro implements Comparable<Libro> {
    private final String titulo;
    private int priodidad;

    public Libro(String titulo, int priodidad) {
        this.titulo = titulo;
        this.priodidad = priodidad;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.priodidad - libro.priodidad;
    }
}
