package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class FiguraPlana {
    private final double base;
    private final double altura;

    public FiguraPlana(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    void mostrarDimension() {
        System.out.println("La base y altura es: " + base + " y " + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
