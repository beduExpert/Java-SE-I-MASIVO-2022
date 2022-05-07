package org.bedu.java.jse.basico.sesion06.tarea;

public abstract class Cuenta {

    private final String INSTITUCION;
    private final String TIPO;
    private final int MIN;
    private final int MAX;

    {
        INSTITUCION = "BEDU_BANK";
        TIPO = "Cuenta base";
        MIN = 0;
        MAX = 0;
    }

    public String getINSTITUCION() {
        return INSTITUCION;
    }

    public String getTIPO() {
        return TIPO;
    }

    public int getMIN() {
        return MIN;
    }

    public int getMAX() {
        return MAX;
    }

}
