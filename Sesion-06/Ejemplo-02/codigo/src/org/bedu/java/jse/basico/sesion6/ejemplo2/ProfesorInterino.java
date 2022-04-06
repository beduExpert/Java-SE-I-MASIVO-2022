package org.bedu.java.jse.basico.sesion6.ejemplo2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ProfesorInterino(fechaTerminacion: " + fechaTerminacion + ")");
    }
}
