package org.bedu.java.jse.basico.sesion6.ejemplo2;

public abstract class Persona {

    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void mostrarDatos(){
        System.out.println("Persona(nombre: " + nombre + ", apellidos: " + apellidos + ")");
    }
}
