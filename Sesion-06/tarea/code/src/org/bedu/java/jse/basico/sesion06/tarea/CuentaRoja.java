package org.bedu.java.jse.basico.sesion06.tarea;

public class CuentaRoja extends Cuenta {

    private final String TIPO;
    private final int MIN;
    private final int MAX;

    {
        TIPO = "Cuenta Roja";
        MIN = 0;
        MAX = 100_000;
    }

    @Override
    public String getTIPO() {
        return TIPO;
    }

    @Override
    public int getMIN() {
        return MIN;
    }

    @Override
    public int getMAX() {
        return MAX;
    }

    @Override
    public String toString() {
        return "CuentaRoja{" +
                "TIPO='" + TIPO + '\'' +
                ", MIN=" + MIN +
                ", MAX=" + MAX +
                '}';
    }
}
