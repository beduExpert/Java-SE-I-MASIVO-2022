package org.bedu.java.jse.basico.sesion04.tarea;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        System.out.println("sesión: " + alumno.getSesion());
        System.out.println("curso: " + alumno.getCurso());
        System.out.println("objetivo " + alumno.getObjetivo());
    }
}
