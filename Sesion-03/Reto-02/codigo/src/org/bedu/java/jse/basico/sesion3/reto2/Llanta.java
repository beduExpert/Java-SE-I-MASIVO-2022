package org.bedu.java.jse.basico.sesion3.reto2;

public class Llanta {
    private float ancho;
    private float diametro;
    private float presion;

    public void rueda(){
        System.out.println("Rodando.... ");
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }
}
