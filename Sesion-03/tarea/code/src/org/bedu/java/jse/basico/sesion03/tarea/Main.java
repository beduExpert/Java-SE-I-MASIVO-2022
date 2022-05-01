package org.bedu.java.jse.basico.sesion03.tarea;

public class Main {

    public static void main(String[] args) {
        Llanta delanteraIzquierda = new Llanta();
        delanteraIzquierda.setEtiqueta("delantera izquierda");
        delanteraIzquierda.setAncho(205);
        delanteraIzquierda.setDiametro(16);
        delanteraIzquierda.setPresion(35);

        Llanta delanteraDerecha = new Llanta();
        delanteraDerecha.setEtiqueta("delantera derecha");
        delanteraDerecha.setAncho(205);
        delanteraDerecha.setDiametro(16);
        delanteraDerecha.setPresion(35);

        Llanta traseraIzquierda = new Llanta();
        traseraIzquierda.setEtiqueta("trasera izquierda");
        traseraIzquierda.setAncho(205);
        traseraIzquierda.setDiametro(16);
        traseraIzquierda.setPresion(35);

        Llanta traseraDerecha = new Llanta();
        traseraDerecha.setEtiqueta("trasera derecha");
        traseraDerecha.setAncho(205);
        traseraDerecha.setDiametro(16);
        traseraDerecha.setPresion(35);

        Combustible combustible = new Combustible();
        combustible.setLitrosActuales(0);
        combustible.setLitrosMaximos(40);

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setCombustible(combustible);
        vehiculo.colocaLlantas(delanteraIzquierda, delanteraDerecha, traseraIzquierda, traseraDerecha);
        vehiculo.llenaTanque();

        for (int i = 1; i <= 5; i++) {
            vehiculo.avanza();
        }
    }
}
