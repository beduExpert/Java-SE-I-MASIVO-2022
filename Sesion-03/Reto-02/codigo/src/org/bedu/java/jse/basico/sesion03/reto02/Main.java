package org.bedu.java.jse.basico.sesion03.reto02;

public class Main {

    public static void main(String[] args) {

        Champinion champ1 = new Champinion();
        champ1.setAlto(3.3F);
        champ1.setAncho(1.5F);
        champ1.setFresco(true);
        Champinion champ2 = new Champinion();
        champ2.setAlto(3.3F);
        champ2.setAncho(1.5F);
        champ2.setFresco(true);
        Champinion champ3 = new Champinion();
        champ3.setAlto(3.3F);
        champ3.setAncho(1.5F);
        champ3.setFresco(true);

        Queso queso = new Queso();
        queso.setTipo("Mozzarella");
        queso.setPeso(500);
        queso.setFresco(true);

        Pizza pizza = new Pizza();
        if (pizza.sonChampinionesFrescos(champ1, champ2, champ3) && pizza.esQuesoFresco(queso)) {
            pizza.cocinarPizza(queso, champ1, champ2, champ3);
            pizza.cortarPizza(8);
            pizza.comerPizza();
        }
    }

}
