package org.bedu.java.jse.basico.sesion4.reto2;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

    public Combustible(int litrosMaximos, int litrosActuales) {
        this.litrosMaximos = (short) litrosMaximos;
        this.litrosActuales = (short) litrosActuales;
    }

    public void usa() {
        litrosActuales--;
        System.out.println("Quedan " + litrosActuales + " litros.");
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Combustible that = (Combustible) o;

        if (litrosMaximos != that.litrosMaximos) return false;
        return litrosActuales == that.litrosActuales;
    }

    @Override
    public int hashCode() {
        int result = litrosMaximos;
        result = 31 * result + (int) litrosActuales;
        return result;
    }
}