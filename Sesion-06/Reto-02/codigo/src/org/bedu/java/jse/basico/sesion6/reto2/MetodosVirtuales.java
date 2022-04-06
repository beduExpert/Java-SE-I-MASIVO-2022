package org.bedu.java.jse.basico.sesion6.reto2;

public class MetodosVirtuales {
    public static void main(String[] args) {
        Figura figura = null;

        figura = new Triangulo();
        llamaCalculaArea(figura);

        figura = new Cuadrado();
        llamaCalculaArea(figura);

        figura = new Rectangulo();
        llamaCalculaArea(figura);
    }

    public static void llamaCalculaArea(Figura figura) {
        figura.formulaCalculaArea();
    }
}
