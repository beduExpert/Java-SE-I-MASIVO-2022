package org.bedu.java.jse.basico.sesion4.reto1;

public class Rectangulo {
    private double alto;
    private double ancho;

    public Rectangulo() {
        this(0);
    }

    public Rectangulo(double lados) {
        this(lados, lados);
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calculaArea(){
        return alto * ancho;
    }
}
