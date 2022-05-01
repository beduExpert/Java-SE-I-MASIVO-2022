package org.bedu.java.jse.basico.sesion03.reto02;

public class Pizza {

    private Champinion[] champs = new Champinion[3];
    private Queso queso;
    private int rebanadas;

    public boolean esQuesoFresco(Queso queso) {
        if (!queso.isFresco()) {
            System.out.println("No se puede hacer una pizza con queso no fresco");
            return false;
        }
        System.out.println("Los champiniones son frescos, procediendo a agregarlos");
        return true;
    }

    public boolean sonChampinionesFrescos(Champinion cham1, Champinion cham2, Champinion cham3) {
        champs[0] = cham1;
        champs[1] = cham2;
        champs[2] = cham3;
        for (Champinion champ : champs) {
            if (!champ.isFresco()) {
                System.out.println("No se puede hacer una pizza con champiniones no frescos");
                return false;
            }
        }
        System.out.println("El queso es fresco, procediendo a agregarlo");
        return true;
    }

    public void cocinarPizza(Queso queso, Champinion champ1, Champinion champ2, Champinion champ3) {
        System.out.println("Cocinando pizza...");
    }

    public void cortarPizza(int rebanadas) {
        this.setRebanadas(rebanadas);
        System.out.println("Cortando la pizza en " + this.getRebanadas() + " rebanadas");
    }

    public void comerPizza() {
        for (int i = 1; i <= this.getRebanadas(); i++) {
            System.out.println("Comiendo rebanada " + i);
        }
    }

    public int getRebanadas() {
        return rebanadas;
    }

    public void setRebanadas(int rebanadas) {
        this.rebanadas = rebanadas;
    }
}
