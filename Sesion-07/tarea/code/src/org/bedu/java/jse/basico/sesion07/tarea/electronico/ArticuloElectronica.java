package org.bedu.java.jse.basico.sesion07.tarea.electronico;

import org.bedu.java.jse.basico.sesion07.tarea.Articulo;

public abstract class ArticuloElectronica extends Articulo {

    private String fabricante;
    private String modelo;

    public ArticuloElectronica(String departamento, double precio, String fabricante, String modelo) {
        super(departamento, precio);
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "ArticuloElectronica{" +
                "departamento='" + getDepartamento() + '\'' +
                "precio='" + getPrecio() + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
