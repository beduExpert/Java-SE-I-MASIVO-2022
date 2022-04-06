package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(4.0, 4.0, "Estilo 1");
        System.out.println("Información para Triángulo 1: ");
        triangulo1.mostrarEstilo();
        triangulo1.mostrarDimension();
        System.out.println("Su área es: " + triangulo1.area());

    }
}
