package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class Triangulo extends FiguraPlana {
    private final String estilo;

    public Triangulo(double base, double altura, String estilo) {
        super(base, altura);
        this.estilo = estilo;
    }

    public double area() {
        return getBase() * getAltura() / 2;
    }

    public void mostrarEstilo() {
        System.out.println("Triangulo es: " + estilo);
    }
}