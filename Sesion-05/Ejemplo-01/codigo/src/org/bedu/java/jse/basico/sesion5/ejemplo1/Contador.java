package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class Contador {
    private static short contadorClase;
    private short contadorInstancia;

    public Contador() {
        contadorClase++;
        contadorInstancia++;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
