package org.bedu.java.jse.basico.sesion6.ejemplo2;

public class Profesor extends Persona {

    private String idProfesor;

    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Profesor (Id de profesor: " + idProfesor + ")");
    }
}