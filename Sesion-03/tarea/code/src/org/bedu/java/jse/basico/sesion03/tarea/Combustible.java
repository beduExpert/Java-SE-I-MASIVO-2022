package org.bedu.java.jse.basico.sesion03.tarea;

public class Combustible {
    private int litrosMaximos;
    private int litrosActuales;

    public void usaCombustible() {
        litrosActuales--;
        System.out.println("Quedan " + litrosActuales + " litros.");
    }

    public int getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(int litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public int getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(int litrosActuales) {
        this.litrosActuales = litrosActuales;
    }
}
