package org.bedu.java.jse.basico.sesion06.tarea;

public class Main {

    public static void main(String[] args) {

        // Cuenta cuenta = new Cuenta();

        Usuario beto = new Usuario("Beto", "Bedu", 21, new CuentaRoja());
        Usuario marina = new Usuario("Marina", "Shudegova", 31, new CuentaOro());
        Usuario amber = new Usuario("Amber", "Happy", 18, new CuentaPlatinum());

        System.out.println(beto);
        System.out.println(marina);
        System.out.println(amber);
    }
}
