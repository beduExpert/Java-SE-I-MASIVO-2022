package org.bedu.java.jse.basico.sesion1.ejemplo4;

public class OrientacionObjetos {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Marjane");
        autor.setApellido("Satrapi");
        autor.setEdad(50);

        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setTitulo("Persepolis");
        libro.setNumeroPaginas(368);

        System.out.println("Libro: " + libro.getTitulo() );
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
    }
}
