package org.bedu.java.jse.basico.sesion07.tarea;

public abstract class Articulo {

    private String departamento;
    private double precio;

    public Articulo(String departamento, double precio) {
        this.departamento = departamento;
        this.precio = precio;
    }

    public Articulo(String departamento) {
        this.departamento = departamento;
    }

    public Articulo(double precio) {
        this.precio = precio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getPrecio() {
        return precio;
    }

}
