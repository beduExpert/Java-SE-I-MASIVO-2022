package org.bedu.java.jse.basico.sesion5.ejemplo3;

public class Sobrecarga {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Gladiadores", "Valencia", 5);
        Equipo equipo2 = new Equipo("CDMX");

        System.out.println("El equipo " + equipo2.getNombre() + " de " + equipo2.getCiudad() + " tiene " + equipo2.getPuntos() + " puntos.");

        equipo2.actualiza(10);
        equipo2.actualiza("Vencedores");

        System.out.println("El equipo " + equipo2.getNombre() + " de " + equipo2.getCiudad() + " tiene " + equipo2.getPuntos() + " puntos.");
    }
}
