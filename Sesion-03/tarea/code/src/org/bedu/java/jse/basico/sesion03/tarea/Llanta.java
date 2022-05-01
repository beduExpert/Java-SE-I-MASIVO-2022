package org.bedu.java.jse.basico.sesion03.tarea;

public class Llanta {

    private String etiqueta;
    private float ancho;
    private float diametro;
    private float presion;

    public void rueda() {
        System.out.println("Rodando llanta "+this.getEtiqueta());
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
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
