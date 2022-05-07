package org.bedu.java.jse.basico.sesion06.tarea;

public class CuentaOro extends Cuenta {

    private final String TIPO;
    private final int MIN;
    private final int MAX;

    {
        TIPO = "Cuenta Oro";
        MIN = 3_000;
        MAX = 500_000;
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
        return "CuentaOro{" +
                "TIPO='" + TIPO + '\'' +
                ", MIN=" + MIN +
                ", MAX=" + MAX +
                '}';
    }
}
