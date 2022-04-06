package org.bedu.java.jse.basico.sesion4.reto2;

public class Llanta {
    private float ancho;
    private float diametro;
    private float presion;

    public Llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Llanta llanta = (Llanta) o;

        if (Float.compare(llanta.ancho, ancho) != 0) return false;
        if (Float.compare(llanta.diametro, diametro) != 0) return false;
        return Float.compare(llanta.presion, presion) == 0;
    }

    @Override
    public int hashCode() {
        int result = (ancho != +0.0f ? Float.floatToIntBits(ancho) : 0);
        result = 31 * result + (diametro != +0.0f ? Float.floatToIntBits(diametro) : 0);
        result = 31 * result + (presion != +0.0f ? Float.floatToIntBits(presion) : 0);
        return result;
    }
}