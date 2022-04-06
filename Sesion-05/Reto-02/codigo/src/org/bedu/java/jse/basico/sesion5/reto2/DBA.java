package org.bedu.java.jse.basico.sesion5.reto2;

import java.time.LocalDate;

public class DBA extends Empleado {
    private String herramientaConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientaConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientaConsultas = herramientaConsultas;
    }

    public String getHerramientaConsultas() {
        return herramientaConsultas;
    }

    public void setHerramientaConsultas(String herramientaConsultas) {
        this.herramientaConsultas = herramientaConsultas;
    }
}
