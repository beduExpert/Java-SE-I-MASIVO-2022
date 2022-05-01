package org.bedu.java.jse.basico.sesion03.tarea;

public class Vehiculo {

    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(
            Llanta delanteraIzquierda,
            Llanta delanteraDerecha,
            Llanta traseraIzquierda,
            Llanta traseraDerecha) {
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }

    public void llenaTanque() {
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanza() {
        if (combustible.getLitrosActuales() > 0) {
            for (Llanta llanta : llantas) {
                llanta.rueda();
            }
            combustible.usaCombustible();
        } else {
            System.out.println("No hay combustible");
        }
    }
}
