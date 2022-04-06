package org.bedu.java.jse.basico.sesion4.reto1;

public class Reto1 {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2);
        Rectangulo rectangulo3 = new Rectangulo(3, 2);

        System.out.println("Rectangulo 1: " + rectangulo1.calculaArea());
        System.out.println("Rectangulo 2: " + rectangulo2.calculaArea());
        System.out.println("Rectangulo 3: " + rectangulo3.calculaArea());
    }
}
