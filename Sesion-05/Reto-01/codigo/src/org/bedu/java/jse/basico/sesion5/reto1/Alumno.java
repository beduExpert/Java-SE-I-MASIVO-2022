package org.bedu.java.jse.basico.sesion5.reto1;

public class Alumno {

    private String nombre;
    private int edad;
    private String grupo;
    private static int counter;

    static {
        counter = 9;
    }

    public Alumno(String nombre, int edad, String grupo) {
        this.nombre = nombre;
        this.edad = edad;
        this.grupo = grupo;
        counter ++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Alumno.counter = counter;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", grupo='" + grupo + '\'' +
                '}';
    }
}